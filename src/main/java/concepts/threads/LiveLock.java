package concepts.threads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class LiveLock {

    private ReentrantLock lock1 = new ReentrantLock(true);
    private ReentrantLock lock2 = new ReentrantLock(true);


    public void worker1() {

        while (true) {

            try {
                lock1.tryLock(50, TimeUnit.MILLISECONDS);

            } catch (Exception ex) {
                ex.printStackTrace();
            }

            System.out.println("Worker1 acquires lock 1");


            if (lock2.tryLock()) {
                System.out.println("Worker 1 acquires lock 2");
                lock2.unlock();
            } else {
                System.out.println("Worker1 could not acquire lock 2");
                continue;
            }

            break;

        }
        lock1.unlock();

    }

    public void worker2() {
        while (true) {

            try {
                lock2.tryLock(50, TimeUnit.MILLISECONDS);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            System.out.println("Worker1 acquires lock 1");

            if (lock1.tryLock()) {
                System.out.println("Worker 2 acquires lock 2");
                lock1.unlock();
            } else {
                System.out.println("Worker2 could not acquire lock 2");
                continue;
            }

            break;

        }

        lock2.unlock();
    }

    public static void main(String[] args) {

        LiveLock liveLock = new LiveLock();

        new Thread(liveLock::worker1, "Worker 1").start();
        new Thread(liveLock::worker2, "Worker 2").start();

    }


}
