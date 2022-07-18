package date;

import java.util.Calendar;
import java.util.Date;

public class _01_DataCalender {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        String[] weeks = {"", "일", "월", "화", "수", "목", "금", "토"};
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH)+1); // 0~11
        System.out.println(c.get(Calendar.DATE)); 
        System.out.println(weeks[c.get(Calendar.DAY_OF_WEEK)]); // 일요일 = 1
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        c.set(Calendar.YEAR, 2100);
    }
}
