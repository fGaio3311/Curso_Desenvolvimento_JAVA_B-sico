package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IsBefore15May2010 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String dateString = "14-08-1999 12:00:00";
        String dateString2 = "15-05-2010 12:00:00";


        try {
            Date date = sdf.parse(dateString);
            Date date2 = sdf.parse(dateString2);

            if(date.before(date2)) {
                System.out.println("É antes!!");
            }

            else {
                System.out.println("É depois!!");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
