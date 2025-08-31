// Thread by extending Thread class
class MyThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread 1: " + i);
            try { Thread.sleep(2000); } catch (InterruptedException e) {}
        }
    }
}

// Thread by implementing Runnable interface
class MyThread2 implements Runnable {
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println("Thread 2: " + i);
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }
    }
}

// Class to demonstrate synchronization
class Counter {
    int count = 0;

    // synchronized method
    public synchronized void incrementSyncMethod() {
        count++;
        System.out.println("Synchronized Method: count = " + count);
    }

    // synchronized block
    public void incrementSyncBlock() {
        synchronized (this) {
            count++;
            System.out.println("Synchronized Block: count = " + count);
        }
    }
}

public class Lab10 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("--- Creating Threads ---");
        MyThread1 t1 = new MyThread1();
        Thread t2 = new Thread(new MyThread2());

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Thread 1 Priority: " + t1.getPriority());
        System.out.println("Thread 2 Priority: " + t2.getPriority());

        t1.start();
        t2.start();

        // Demonstrating isAlive() and join()
        System.out.println("Thread 1 alive? " + t1.isAlive());
        t1.join(); // wait for t1 to finish
        t2.join(); // wait for t2 to finish
        System.out.println("Both threads completed.");

        // Demonstrating synchronized method and block
        Counter counter = new Counter();
        System.out.println("\n--- Synchronization Demo ---");
        counter.incrementSyncMethod();
        counter.incrementSyncBlock();

        // Lab Report details
        System.out.println("\n--- Lab Report Details ---");
        System.out.println("Lab No.: 10");
        System.out.println("Name: Prabesh Neupane");
        System.out.println("Roll No./Section: 72/078 Sec B");
    }
}
