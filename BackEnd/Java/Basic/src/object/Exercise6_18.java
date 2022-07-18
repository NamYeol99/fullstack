package object;

public class Exercise6_18 {
    public static boolean isNumber(String str){
        return str.matches("[+-]?\\d*(\\.\\d+)?");
        
        
    }
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str)); 
        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }
}
