package array;

import java.util.Arrays;

public class _02_Array {
  public static void main(String[] args) {
    //참조형 타입의 배열 접근
    Car[] cars = new Car[5];
    for (int i = 0; i < cars.length; i++) {
      cars[i] = new Car();
      cars[i].num = i;
      System.out.println(cars[i]);
    }
    System.out.println(Arrays.toString(cars));

    //기본형 타입의 배열 접근
    int[] arr = new int[5];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i+1;
      if(i!=0) System.out.print(",");
      System.out.print(arr[i]);
    }
    System.out.println();
    System.out.println(Arrays.toString(arr));
  }
}

class Car{
  int num;
  
  public String toString() {
    return "Car " + num;
  }
}
