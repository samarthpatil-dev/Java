package packages.util_package;

import java.util.Date;
import java.util.Calendar;

public class date_calendar {
    public static void main(String [] args){
        Date d = new Date();
        System.out.println("Current date = "+d);
        Calendar c = Calendar.getInstance();
        int day = c.get(Calendar.DATE);
        int month = c.get(Calendar.MONTH)+1;
        int year = c.get(Calendar.YEAR);
        System.out.println(" Day = "+d+"  Month = "+month+" Year = "+year);
    }
}
