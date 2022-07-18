package thread;

public class _01_Thread {
    public static void main(String[] args) {
        System.out.println("Main Thread Started");
        //상속으로 구현방법
        MyThread t1 = new MyThread();
        t1.start();
        //인터페이스 구현 방법
        MyRunnable r1 = new MyRunnable();
        Thread t2 = new Thread(r1);
        t2.start();
        System.out.println("Main Thread is finished");
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("finished Runnable");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("finished Thread");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
