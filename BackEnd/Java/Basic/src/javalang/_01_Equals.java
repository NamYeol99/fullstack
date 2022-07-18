package javalang;

public class _01_Equals {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);
        System.out.println(v1.hashCode());
        System.out.println(v2.hashCode());
        System.out.println(v1==v2);
        System.out.println(v1.equals(v2));
        // if(v1.equals(v2))
        //     System.out.println("v1과 v2는 같습니다");
        // else
        //     System.out.println("v1과 v2는 다릅니다.");
    }
}

class Value {
    int val;

    Value(int val){
        this.val = val;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Value) {
            Value tmp = (Value)obj; // 자->부->자 반드시명시적 형변환
            return val == tmp.val;
        }
        return false;
    }
}

