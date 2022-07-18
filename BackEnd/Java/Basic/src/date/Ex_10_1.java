package date;

import java.util.Calendar;
import java.util.Date;

public class Ex_10_1 {
    public static void main(String[] args) {
        Calendar startDay = Calendar.getInstance();
        for (int i = 1; i <= 12; i++) {
            int asd = 0;
            for (int j = 1; j <= 30; j++){
                startDay.set(2020,i-1,j);
                if(startDay.get(Calendar.DAY_OF_WEEK) == 2){
                    asd++;
                    
                }
                if(startDay.get(Calendar.DAY_OF_WEEK) == 1 && asd == 1){
                    System.out.println("2020"+"-"+i+"-" + j+"-"+"은 2번째 일요일입니다.");
                }
                
            }
        }
    }
}
