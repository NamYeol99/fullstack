package array;

public class _01_Array {
  public static void main(String[] args) {
    int arr[] = new int[10]; //element의 값 0으로 채워짐
    int arr2[] = new int[]{1,2,3,4,5};
    int arr3[] = {1,2,3,4,5};
    arr3 = new int[5];
    arr3[0] = 1;arr3[1] = 1;arr3[2] = 1;arr3[3] = 1;arr3[4] = 1;
    // arr3 = {1,2,3,4,5}; //안됨
    arr3 = new int[]{1,2,3};
    System.out.println(arr3[10]);

  }
}
