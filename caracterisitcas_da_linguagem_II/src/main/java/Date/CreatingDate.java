package Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CreatingDate {
    public static void main(String[] args) {
        int year = 2016;
        int month = 0;
        int date = 1;

        Calendar cal = Calendar.getInstance();

        cal.clear();
        System.out.println();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DATE, date);

        System.out.println(cal.getTime());
        System.out.println();
    }
}
