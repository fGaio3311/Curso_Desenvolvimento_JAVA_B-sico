package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyBirthday {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String dateString = "14-08-1999 12:00:00";

        try {
            Date date = sdf.parse(dateString);
            System.out.println("Given Time in milliseconds: "+ date.getTime());

            Calendar calendar = Calendar.getInstance();

            calendar.setTime(date);
            System.out.println("Given Time in milliseconds: "+ calendar.getTimeInMillis());
        }

        catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
