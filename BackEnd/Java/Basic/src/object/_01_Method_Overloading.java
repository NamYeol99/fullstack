package object;

public class _01_Method_Overloading {
  public static void main(String[] args) {
    MyMath mm = new MyMath();
    System.out.println(mm.add(true, 1 < 2));
  }
}

class MyMath {
  int add(int a, int b) {
    int result = 0;
    result = a + b;
    return result;
  }

  boolean add(boolean a, boolean b) {
    return a || b;
  }

  String add(int a, String b) {
    return a + " " + b;
  }

  void add(String c, int d){
    return;
  }
}