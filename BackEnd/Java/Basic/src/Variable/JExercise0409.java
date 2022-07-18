import java.util.Scanner;

public class JExercise0409 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Input number");
    String input = s.nextLine();
    int num = 0;
    int sum = 0;
    try{
      num = Integer.parseInt(input);
    } catch (Exception e){
      System.out.println("숫자를 입력하지 않아서 종료합니다.");
      System.exit(-1);
    }
    int tmp = num;
    while(true){
      if(tmp/10 == 0){  //10보다 작은수를 10으로 나눌 때 몫은 0
        sum += tmp; //10보다 작은 수를 더하고,
        break; //루프를 끝냄
      } else {
        sum += tmp%10; //10으로 나누고 나머지를 합한다.
        tmp = tmp/10; //10으로 나눈 몫을 tmp에 담고 루푸로 돌아간다.
      }
    }
    System.out.println(sum);
  }
}
