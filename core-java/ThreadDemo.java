class ClassA extends Thread{
    public void run() {     // thread start will call this run method
        for(int i = 0; i < 5; i++) {
            System.out.println("Hi from Class A");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ClassB extends Thread {
    public void run() {     // thread start will call this run method
        for(int i = 0; i < 5; i++) {
            System.out.println("Hi from Class B");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        ClassA objA = new ClassA();
        ClassB objB = new ClassB();

        objA.start(); // starting objA thread
        objB.start(); // starting objB thread

        objA.join();  // waiting for objA thread to join main thread
        objB.join();  // waiting for objB thread to join main thread

        System.out.println("End of Main");
    }
}
