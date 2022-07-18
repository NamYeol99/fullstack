package exception;

public class _03_CustomException {
    public static void main(String[] args) {
        try {
            // throw new MyException("내가만든 ex");       
        } catch (Exception e) {
            e.printStackTrace();
            try{
                throw new Exception();
            } catch (Exception e1){

            }
        }
        
    }
}
class MyException extends Exception {
    public MyException(){
        super("KNY Exception");
    }
}
