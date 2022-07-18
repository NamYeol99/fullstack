package stream;


import java.util.*;
import java.util.stream.*;

public class _04_Stream_MidOperator {
    public static void main(String[] args) {
        Stream<String[]> strArrStream = Stream.of( 
            new String[]{"abc", "def", "jkl"},
            new String[]{"ABC", "GHI", "JKL"}
        );
        // Stream<Stream<String>> strStream = strArrStream.map(Arrays::stream);
        Stream<String> strStream = strArrStream.flatMap(Arrays::stream);
        strStream.map(String::toLowerCase).distinct().sorted().forEach(System.out::println);
        System.out.println();


        Optional<Value> opt = Optional.of(new Value());
        Optional<Value> opt1 = Optional.ofNullable(null);
        Optional<Value> opt2 = Optional.<Value>empty(); //빈객체로 초기화
        Value v = opt.get();
             

    }
}
class Value{

}
