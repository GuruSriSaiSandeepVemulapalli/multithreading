package ThreadCreation.Runnable;

public class RunnableExample implements Runnable {

    Thread mythread ;
    RunnableExample()
    {
        mythread = new Thread((Runnable) this, "my runnable thread");
        System.out.println("my thread created" + mythread);
        mythread.start();
    }

    public void run() {
        try
        {
            for (int i=0 ;i<10;i++)
            {
                System.out.println("Printing the count " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("my thread interrupted");
        }
        System.out.println("mythread run is over" );
    }
 }

