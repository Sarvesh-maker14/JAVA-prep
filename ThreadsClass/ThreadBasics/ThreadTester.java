package ThreadsClass.ThreadBasics;

public class ThreadTester {
    public static void main(String[] args) {
        
        System.out.println(" main is starting ");
        // Thread thread1 = new Thread1("thread1");
        // // thread1.setDaemon(true);
        // thread1.start();//async method // to start the thread
        // //jab bhi jvm free hoga wo 

        // Thread2 thread2 = new Thread2("thread2");

        Thread thread2 = new Thread(() -> {
            for(int i = 0;i<5;i++){
                System.out.println("inside thread1 "+ Thread.currentThread() + " "+ i);
            }
        },"thread2");
        thread2.start();
        
        System.out.println("main is exiting ");

        new Thread().run();
    }
}
