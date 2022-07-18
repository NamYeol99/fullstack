package array;

public class Exercise5_5 {
  public static void main(String[] args) {
    int lotto[] = new int[45];
    for (int i = 0; i < lotto.length; i++) {
      lotto[i] = i+1;
    }
    _04_ArrayShuffleSort.shuffle(lotto);
    pick6Balls(lotto);
  }
  static void pick6Balls(int[] arr){
    System.out.print("[");
    for (int i = 0; i < 6; i++) {
      if(i!=0) System.out.print(",");
      System.out.print(arr[i]);
    }
    System.out.println("]");
  }
}
