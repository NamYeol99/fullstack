package array;

import java.util.Arrays;

public class _03_ArrayMaxMinAvgSum {
  public static void main(String[] args) {
    int[] arr = new int[10];
    int total = 0;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int)(Math.random()*arr.length) + 1;
    }
    int max = arr[0];
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
      total += arr[i];
      if(max<arr[i]) max = arr[i];
      if(min>arr[i]) min = arr[i];
    }
    System.out.println(Arrays.toString(arr));
    System.out.printf("합: %d  평균: %4.2f %n",total,(float)total/arr.length);
    System.out.printf("최대값: %d, 최소값: %d %n", max, min);
  }
}
