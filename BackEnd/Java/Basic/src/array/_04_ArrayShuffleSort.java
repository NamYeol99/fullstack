package array;

import java.util.Arrays;

public class _04_ArrayShuffleSort {
  public static void main(String[] args) {
    int[] arr = new int[10];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i;
    }
    System.out.println(Arrays.toString(arr)); //초기값 출력
    shuffle(arr); // shuffle
    bubbleSort(arr);
    shuffle(arr); // shuffle
    selectionSort(arr);
    // Arrays.sort(arr); //Arrays의 정렬 메서드
  }

  private static void selectionSort(int[] arr) {
    int count = 0; //정렬 횟수를 파악하기 위한 변수
    for (int i = 0; i < arr.length-1; i++) {
      boolean change = false; //자리바꿈이 일어났는지 확인하는 변수
      for (int j = 0+i; j < arr.length; j++) {
        if(arr[i]>=arr[j]){
          int tmp = arr[i];
          arr[i] = arr[j];
          arr[j] = tmp;
          change = true; //자리바꿈이 일어나면 true, false하는 경우 없어요
          count++;
        }
      }
      if(!change) break;
    }
    System.out.println(Arrays.toString(arr) + count+"번만에 정렬:selectionSort");
  }

  static void shuffle(int[] arr){
    for (int i = 0; i < arr.length; i++) {
      int rand = (int) (Math.random() * arr.length);
      int tmp = arr[i];
      arr[i] = arr[rand];
      arr[rand] = tmp;
    }
    System.out.println(Arrays.toString(arr));
  }
  static void bubbleSort(int[] arr) {
    int count = 0; //정렬 횟수를 파악하기 위한 변수
    for (int i = 0; i < arr.length-2; i++) { //버블소트의 전체 회전수 
      boolean change = false; //자리바꿈이 일어났는지 확인하는 변수
      for (int j = 0; j < arr.length-1-i; j++) { //버블 2개가 돌기위한 반복문
        if(arr[j] > arr[j+1]) {
          int tmp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = tmp;
          change = true; //자리바꿈이 일어나면 true, false하는 경우 없어요
        }
        count++;
      }
      if(!change) break;
    }
    System.out.println(Arrays.toString(arr) + count+"번만에 정렬:bubbleSort");
  }
}
