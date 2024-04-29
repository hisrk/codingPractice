package practiceNew;

public class ThreeThreads {

    private static Object lock= new Object();

    public static void main(String[] args) {


        for(int i=0;i<20;i++){


            System.out.println(i+","+Thread.currentThread().getPriority());
        }
        
        Thread thread1= new Thread(ThreeThreads:: givenLoop);
        Thread thread2= new Thread(new Runnable() {
            @Override
            public void run() {
                givenLoop();;
            }
        });
        Thread thread3= new Thread(ThreeThreads:: givenLoop);


          thread1.setName("t1");
          thread2.setName("t2");
          thread3.setName("t3");

        thread1.start();
        thread2.start();
        thread3.start();



        
        
        
    }

    private static void givenLoop() {

        synchronized (lock){

        for(int i=0;i<20;i++) {


            System.out.println(i + "," + Thread.currentThread().getName());

        }
        }
    }
}
