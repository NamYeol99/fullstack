import java.util.Scanner;

import javax.swing.JOptionPane;

public class InputEx {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("당신의 이름을 입력하세요 : ");
    String input = s.nextLine();
    System.out.println(input + "님 환영합니다.");
    
    input = JOptionPane.showInputDialog(null, "당신의 이름을 입력하세요");
    System.out.println(input + "을 격하게 환영합니다.");
    System.out.println(true + "" + null);
    s.close();
    int x = 1;
    int y = 2;
    int tmp= x;
    x = y;
    y = tmp;
    
  }
}
