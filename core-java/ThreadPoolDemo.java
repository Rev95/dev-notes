import java.util.concurrent.*;

class Task implements Runnable {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        for(int i = 0; i < 1; i++) {
            System.out.println(taskName + " is running on " + Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 30, TimeUnit.SECONDS,
                new ArrayBlockingQueue(2), new CustomThreadFactory(), new CustomRejectedExecutionHandler());
        executor.allowCoreThreadTimeOut(true);  // this needs to be true to use keepAliveTime

        executor.submit(new Task("Task-1"));    // uses thread-0/1
        executor.submit(new Task("Task-2"));    // uses thread-0/1
        executor.submit(new Task("Task-3"));    // added to queue
        executor.submit(new Task("Task-4"));    // added to queue
        executor.submit(new Task("Task-5"));    // queue is full => creates new thread-2 in the pool
        executor.submit(new Task("Task-6"));    // queue is full => creates new thread-3 in the pool
//        executor.submit(new Task("Task-7"));    // queue is full and maximumPoolSize is reached => this task will be rejected

        executor.shutdown();
    }
}

class CustomThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread th = new Thread(r);
        th.setPriority(Thread.MAX_PRIORITY);
        return th;
    }
}

class CustomRejectedExecutionHandler implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task rejected: " + r.toString());
    }
}