public class JExercise0402 {
  public static void main(String[] args) {
    final int NUM = 20;
    int total = 0;
    for (int i = 0; i < NUM; i++) {
      // if(!(i%2==0 || i%3==0)){
      //   total += i;
      // }
      if(i%2!=0 && i%3!=0){
        total += i;
      }
    }
    System.out.println("합 :" + total);
  }
}
