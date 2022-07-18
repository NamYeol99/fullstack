package array;

public class _06_2Dimension {
  public static void main(String[] args) {
    int[][] arr = { 
      { 100, 100, 100 }, 
      { 90, 90, 90 }, 
      { 80, 80, 80 }, 
      { 70, 70, 70 } 
    };
    _05_2Dimension.printArr(arr);
    int[][] result = new int[arr.length + 1][arr[0].length + 1];
    for (int i = 0; i < arr.length; i++) { // arr.length 행의 길이
      for (int j = 0; j < arr[i].length; j++) {
        result[i][j] = arr[i][j];  //arr의 원소를 result에 대입
        result[i][arr[i].length] += arr[i][j]; //행의 합을 끝에 합침
        result[arr.length][j] += arr[i][j]; //열의 합을 열의 마지막 행에 합침
        result[arr.length][arr[i].length] += arr[i][j]; //모든 원소의 합을 합침
      }
    }
    _05_2Dimension.printArr(result);
  }
}
