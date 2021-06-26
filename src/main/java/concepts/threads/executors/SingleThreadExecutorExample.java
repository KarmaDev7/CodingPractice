package concepts.threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SingleThreadExecutorExample extends Thread {

    int i;

    public SingleThreadExecutorExample(int i) {
        this.i = i;
    }

    @Override
    public void run() {

        long duration = (long) (Math.random()*5);

        System.out.println("Doing some job by Thread "+ i + " Thread id: " + Thread.currentThread().getName());

        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10 ; i++) {

            executorService.execute(new SingleThreadExecutorExample(i));

        }



    }
}
