package object;

public class Exercise6_20 {
    public static void main(String[] args) {

        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:" + max(data));
        System.out.println("최대값:" + max(null));
        System.out.println("최대값:" + max(new int[] {}));
    }
    public static int max(int[] data){
        if(data == (null)) {
            return -999999;
        }
        else if (data.length == 0) {
            return -999999;
        }
        else{
            int max = data[0];
            for(int i=0; i<data.length; i++){
                if(max<data[i]) max = data[i];
            }
            return max;
        }
    }
}
