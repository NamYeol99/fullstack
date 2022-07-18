public class JExercise0406 {
  public static void main(String[] args) {
    final int DICE = 6;
    for (int i = 0; i < DICE-1; i++) {
      for (int j = 0; j < DICE; j++) {
        if(i+j == 6)
        System.out.println(i+"/"+j);
      }
    }
    for (int i = 1; i < DICE-1; i++) {
      int diff = DICE - i;
      System.out.println(i+"/"+diff);
    }
  }
}
