import java.util.Scanner;

public class JExercise0407 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Input number");
    String input = s.nextLine();
    int sum = 0;
    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      sum += (c >= '0' && c <= '9') ? c - '0' : 0;
    }
    System.out.println(sum);
  }
}
