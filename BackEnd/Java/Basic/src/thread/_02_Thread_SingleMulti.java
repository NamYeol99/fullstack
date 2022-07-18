package thread;

public class _02_Thread_SingleMulti {
    public static void main(String[] args) {
        ThereadMulti t = new ThereadMulti();
        t.start();
        long startTime = System.currentTimeMillis(); // 시작
        // System.out.println("싱글 쓰레드" + startTime);
        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("-"));
        }
        // long midTime  = System.currentTimeMillis(); // 중간
        // System.out.println(midTime-startTime);
        // for (int i = 0; i < 300; i++) {
        //     System.out.printf("%s", new String("|")); 
        // }
        
        System.out.println(System.currentTimeMillis()); //마침

    }
}

class ThereadMulti extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("|")); 
        }      
    }
}
