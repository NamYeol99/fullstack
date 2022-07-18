public class JExercise03 {
  public static void main(String[] args) {
    int num = 456;
    System.out.println(num/100*100);
    System.out.println((int)(Math.floor(num/100)*100));
    int numOfApples = 123;
    int sizeOfBucket = 10;
    int numOfBucket = (int)(Math.ceil((double)numOfApples/sizeOfBucket));
    numOfBucket = (numOfApples%sizeOfBucket==0?0:1)+numOfApples/sizeOfBucket;
    System.out.println("필요한 바구니의 수:"+numOfBucket);
    int num2 = 10;
    System.out.println(num2>0?"양수":(num2==0?0:"음수"));

    int fahrenheit =  100;
    float celcius = (int)((float)5/9*(fahrenheit-32)*100+0.5) / 100.0f;
    System.out.println(celcius);
    int i= 0;
    for(;;){
      i++;
      if(i>10) break;
    }
  }
}
