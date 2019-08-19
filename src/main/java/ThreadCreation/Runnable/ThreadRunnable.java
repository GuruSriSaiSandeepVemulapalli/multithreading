package ThreadCreation.Runnable;

public class ThreadRunnable implements Runnable{
    public void run() {
        System.out.println("My thread is in running state.");
    }

    public static void main(String[] args) {
        ThreadRunnable obj=new ThreadRunnable();
        Thread tobj =new Thread(obj);
        tobj.start();
    }
}
