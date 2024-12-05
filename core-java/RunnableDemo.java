class ClassA1 implements Runnable {
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Hi from " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ClassB1 implements Runnable {
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Hi from " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) throws InterruptedException {
        ClassA1 objA1 = new ClassA1();
        Runnable objB1 = new ClassB1();

//        objA.start();     // no start function with Runnable interface

        Thread t1 = new Thread(objA1, "objA1 Thread");
        Thread t2 = new Thread(objB1, "objB1 Thread");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("End of Main");
    }
}
