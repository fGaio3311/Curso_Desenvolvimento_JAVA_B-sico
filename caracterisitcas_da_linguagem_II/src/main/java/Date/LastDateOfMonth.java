package Date;

import java.util.Calendar;

public class LastDateOfMonth {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println();
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(cal.getTime());
        System.out.println();

//        Calendar cal = Calendar.getInstance();
//
//        System.out.println();
//        System.out.println("Last day: " + cal.getMaximum(Calendar.DAY_OF_MONTH) +"-"+ (cal.get(Calendar.MONTH) + 1)+"-"+ cal.get(Calendar.YEAR));
//        System.out.println();
    }
}
