package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class _03_timepackage {
  public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    System.out.println(date);
    LocalDate localDate = LocalDate.of(2100, 6, 1);
    localDate = localDate.plus(1,ChronoUnit.DAYS);
    localDate = localDate.plusDays(1);
    //plusYears, plusMonths, plusHours, plusMinutes, plusSeconds
    localDate = localDate.minusDays(1);
    System.out.println(localDate);
    
    LocalTime time = LocalTime.now();
    System.out.println(time);
    LocalTime localTime = LocalTime.of(12, 00,00);
    System.out.println(localTime);

    LocalDateTime ldt = LocalDateTime.now();
    System.out.println(ldt);
    ldt = LocalDateTime.of(date, time);

    System.out.println(ldt);
    Scanner s = new Scanner(System.in);
    System.out.print("년을 입력:(yyyy)");
    String input = s.nextLine();
    // String[] arr = input.split(" ");
    int year = Integer.parseInt(input);
    // int month = Integer.parseInt(arr[1]);
    LocalDate ld;
    for(int i=1;i<=12;i++){
      ld = LocalDate.of(year, i, 1);
      ld = ld.with(ChronoField.ALIGNED_WEEK_OF_MONTH,2); //2번째주
      ld = ld.with(ChronoField.DAY_OF_WEEK,7);//2번째주의 요일
      System.out.println(ld+"/"+ld.getDayOfWeek().getValue());
    }
  }
}
