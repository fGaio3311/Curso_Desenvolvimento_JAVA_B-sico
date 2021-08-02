package Date;

import java.util.Calendar;

public class GetDisplayDate {
    public static void main(String[] args) {
        //Create a default calendar
        Calendar calendar = Calendar.getInstance();
        //Get and display information of current date from the calender:
        System.out.println();
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + calendar.get(Calendar.MONTH));
        System.out.println("Day: " + calendar.get(Calendar.DATE));
        System.out.println("Hour: " + calendar.get(Calendar.HOUR));
        System.out.println("Minute: " + calendar.get(Calendar.MINUTE));
        System.out.println();
    }
}
