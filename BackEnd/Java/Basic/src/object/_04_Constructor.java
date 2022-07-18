package object;

public class _04_Constructor {
    public static void main(String[] args) {
        Foo foo = new Foo("곰돌이", "꿀");
        Foo foo2 = new Foo();
        
        System.out.println(foo.toString());
        System.out.println(foo2.toString());
    }
}
class Foo {
    private String name;
    private String like;
    // 기본생성자(Constructor)
    public Foo(){
        this("곰돌이푸", "꿀"); //default 값 지정
    }
    public Foo(String name, String like){
        this.name = name;
        this.like = like;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("name: %s, price: %s",name, like);
    }   
}
