import javax.swing.JOptionPane;

public class J01Operator {
  public static void main(String[] args) {
    String input = "";
    try{
      input = JOptionPane.showInputDialog(null, "10,3 입력");
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }
    System.out.printf("몫: %d, 나머지: %d %n", 
      Integer.parseInt(input.split(",")[0]) / 3, 
      Integer.parseInt(input.split(",")[1]) % 3
    );
    // 단항 > 산술 > 비교 > 논리 > 삼항 > 대입
    //   <- | ----------------------> | <-

    int result = (int)(Math.random()*100);
    System.out.println(result);

  }
}
