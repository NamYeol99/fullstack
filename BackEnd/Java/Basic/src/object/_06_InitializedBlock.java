package object;

public class _06_InitializedBlock {
    //static initializedBlock   
    static{
        System.out.println("static{}");
    }
    public _06_InitializedBlock(){
        System.out.println("생성자");
    }
    //initialized Block
    {
        System.out.println("{ }");
    }
    public static void main(String[] args) {
        System.out.println("_06_InitializedBlock i1 생성");
        _06_InitializedBlock i1 = new _06_InitializedBlock();
        System.out.println("_06_InitializedBlock i2 생성");
        _06_InitializedBlock i2 = new _06_InitializedBlock();

    }

}
