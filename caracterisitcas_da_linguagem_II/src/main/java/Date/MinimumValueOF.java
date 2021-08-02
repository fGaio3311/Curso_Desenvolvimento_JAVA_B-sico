package Date;

import java.util.Calendar;

public class MinimumValueOF {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int actualMinYear = cal.getMinimum(Calendar.YEAR);
        int actualMinMonth = cal.getMinimum(Calendar.MONTH);
        int actualMinDate = cal.getMinimum(Calendar.DATE);
        int actualMinWeek = cal.getMinimum(Calendar.WEEK_OF_YEAR);

        System.out.println();
        System.out.println("\nCurrent Date and Time: " + cal.getTime());
        System.out.println("Actual Minimum Year: " + actualMinYear);
        System.out.println("Actual Minimum Month: " + actualMinMonth);
        System.out.println("Actual Minimum Date: " + actualMinDate);
        System.out.println("Actual Minimum Week of year: " + actualMinWeek);
        System.out.println();
    }
}
