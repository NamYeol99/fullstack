package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _04_SimpleDate {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd F E요일 hh:mm:ss");
        System.out.println(sdf.format(d));
    }
}
