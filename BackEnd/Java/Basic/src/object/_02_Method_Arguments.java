package object;

public class _02_Method_Arguments {
  public static void main(String[] args) {
    Data d = new Data();  //Data 인스턴스 생성
    System.out.println(d);
    d.x = 100;
    System.out.println(d.x);  //100
    // change(d.x); //d.x 즉 100이라는 값이 change의 매개변수로 전달
    // change(d);
    d = change(d);
    System.out.println(d.x);
    System.out.println(d);
  }
  static void change(int x) {  //1) 일반형 매개변수
    x = 1000;
    System.out.println("change() : x = " + x);
  }
  static void change(Box d) {  //2) 참조형 매개변수
    System.out.println(d);
    d.x = 1000;
    System.out.println("change() : x = " + d.x);
  }
  static Data change(Data d) {  //3) 참조형 매개변수이며 참조형 리턴
    d.x = 1000;
    Data tmp = new Data();
    System.out.println(d);
    System.out.println(tmp);
    tmp.x=d.x;
    return tmp;
  }
}
class Data {
  int x;
}
class Box {
  int x;
}