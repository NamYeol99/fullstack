public class JExercise0404 {
  public static void main(String[] args) {
    int total = 0;
    int i = 0;
    while (total < 100) {
      i++;
      total += (i % 2 == 0 ? -i : i);
      // if(total>=100) break; else i++;
    }
    System.out.println(total+"/"+i);
  }
}
