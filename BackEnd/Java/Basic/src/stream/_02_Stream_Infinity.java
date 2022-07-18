package stream;

import java.io.File;
import java.nio.file.*;
import java.util.List;
import java.util.Random;
import java.util.stream.*;


public class _02_Stream_Infinity {
   public static void main(String[] args) {
    IntStream intStream1 = new Random().ints(1,5);
    intStream1.limit(5).forEach(System.out::println);

    LongStream longStream = LongStream.range(1,45);
    longStream.forEach(System.out::print);
    
    IntStream lotto = IntStream.rangeClosed(1, 45);
    // lotto.forEach(new IntConsumer(){
    //     public void accept(int value){
    //         System.out.println(value);
    //     }
    // });

    lotto.forEach(i->System.out.printf("%3d", i));

    System.out.println();
    Stream<Integer> iteratorStream = Stream.iterate(0, n->n+2); //무한 스트림 생성
    iteratorStream.limit(5).forEach(System.out::print);
    System.out.println();
    
    Stream<Integer> generatorStream = Stream.generate(() -> (int)(Math.random()*10)); //무한 스트림 생성
    generatorStream.limit(5).forEach(System.out::print);
    System.out.println();


    String directory = "C:/";
    try {
        Stream<Path> fileLiStream = Files.list(Paths.get(directory));
        List<File> files = fileLiStream
            .map(Path::toFile)
            .filter(File::isFile)
            .collect(Collectors.toList());
        files.forEach(System.out::println);
    } catch (Exception e) {
        e.printStackTrace();
    }

    //empty stream
    Stream emptyStream = Stream.empty();
    System.out.println(emptyStream.count());
    
    }
}
