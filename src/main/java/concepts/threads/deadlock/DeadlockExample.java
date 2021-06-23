package concepts.threads.deadlock;

/**
 * Deadlock occurs when two or more threads wait forever for a lock
 * or resource held by another threads.
 *
 *
 */
public class DeadlockExample {


    public static void main(String[] args) {

        Thread thread1 = new Thread(() ->{

            synchronized (Integer.class){

                synchronized (String.class){
                    System.out.println("lock acquired!...I can do my job");
                }
            }


        });



        Thread thread2 = new Thread(() ->{

            synchronized (String.class){

                synchronized (Integer.class){
                    System.out.println("lock2 acquired!...I can do my job");
                }
            }


        });


        thread1.start();
        thread2.start();



    }


}
