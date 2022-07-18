package stream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _03_Stream_Operator {
  public static void main(String[] args) {
    String directory = "C:/";
    try {
      Stream<Path> fileLiStream = Files.list(Paths.get(directory));
      fileLiStream.map(Path::toFile) //file, directory 명을 가져옴
          //중간연산을 확인하려고 할 때 여러번 사용가능
          .peek(s->System.out.println(s.toString()))
          .filter(File::isFile)
          // .filter(s->s.toString().indexOf('.') != -1)
          .map(s->s.toString().substring(s.toString().indexOf('.')+1))//확장자 축출
          .map(String::toUpperCase)
          .distinct().forEach(System.out::println);//확장자만 출력
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
