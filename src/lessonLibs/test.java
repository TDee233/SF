package lessonLibs;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test {
    public static void main(String[] args) {

        int a = 3;
        int b = 6;

        System.out.println(Math.abs(a));

        Date date = new Date();
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);

        System.out.println("Сейчас - " + hour + ":" + minute + " " + day + "." + (month + 1) + "." + year);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");

        System.out.println(dateFormat.format(calendar.getTime()));
    }
}
