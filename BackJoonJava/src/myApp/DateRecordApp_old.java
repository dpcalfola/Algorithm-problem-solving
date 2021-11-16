package myApp;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRecordApp_old {
    public static void main(String[] args) throws IOException {
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("EEEE, MMMM, dd, yyyy");
        System.out.println("Recorde in text : " + date.format(today));

        FileWriter fw = new FileWriter("./src/myApp/TodayDateRecorde.txt", true);


        String arrangedDateFormat = String.format("%-29s", date.format(today));


        fw.write("\n" + arrangedDateFormat + " : ");
        fw.close();


    }
}
