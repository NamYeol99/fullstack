package object;

public class Exercise6_4 {
    // static double getDistacne(int x, int y, int x1, int y1){
    //     double result =0.0;
    //     result = Math.sqrt(Math.pow(x1-x,2)+Math.pow(y1-y,2));
    //     return result;
    // }
    public static void main(String[] args) {
        // System.out.println(getDistacne(1, 1, 2, 2));
        MyPoint p = new MyPoint(1,1);
        System.out.println(p.getDistacne(2,2));
    }
}
class MyPoint{
    int x;
    int y;
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public double getDistacne(int x1, int y1){
        // return Exercise6_4.getDistacne(x,y,i,j);
        return Math.sqrt(Math.pow(x1-x,2)+Math.pow(y1-y,2));
    }
}
