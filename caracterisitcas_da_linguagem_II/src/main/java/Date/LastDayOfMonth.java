package Date;

import java.util.Calendar;

public class LastDayOfMonth {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println();
        System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println();
    }
}
