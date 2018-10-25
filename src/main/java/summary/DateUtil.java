package summary;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by zengqiang on 2018/10/25.
 */
public class DateUtil {
    //判断是不是新月份第一天
    public static boolean isFirstDayOfMonth(Date date){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int day = c.get(Calendar.DAY_OF_MONTH);
        return day == 1;
    }

    //判断是不是新一年的第一天
    public static boolean isFirstDayOfYear(Date date){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int day = c.get(Calendar.DAY_OF_YEAR);
        return day == 1;
    }

    public static void main(String[] args){
        String dateStr = "2018-01-01";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            System.out.println(isFirstDayOfMonth(format.parse(dateStr)));
            System.out.println(isFirstDayOfYear(format.parse(dateStr)));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
