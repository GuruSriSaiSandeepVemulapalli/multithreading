package ThreadCreation.Thread;

public class MultiThreadingThreadExample extends Thread {
    public void run(){
        System.out.println("My thread is in running state.");
    }
    public static void main(String args[]){
        MultiThreadingThreadExample obj=new MultiThreadingThreadExample();
        obj.start();
    }

}
