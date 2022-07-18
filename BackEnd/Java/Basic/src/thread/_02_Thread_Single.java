package thread;

public class _02_Thread_Single {
  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();//시작
    System.out.println(startTime);
    for (int i = 0; i < 300; i++) {
      System.out.printf("%s",new String("|"));
    }
    long midTime = System.currentTimeMillis();//중간
    System.out.println(midTime-startTime);
    for (int i = 0; i < 300; i++) {
      System.out.printf("%s",new String("-"));
    }
    System.out.println(System.currentTimeMillis()-midTime);//마침
  }
}
