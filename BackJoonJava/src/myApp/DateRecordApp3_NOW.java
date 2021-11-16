package myApp;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRecordApp3_NOW {

    static Date today = new Date();

    public static void main(String[] args) throws IOException {

        String EEEE = arrangedFormat("EEEE", "%-9s");
        String MMMM = arrangedFormat(", MMMM", "%-10s");
        String dd = arrangedFormat(", dd", "%-3s");
        String yyyy = arrangedFormat(", yyyy", "%-5s");

        String totalDate = EEEE + MMMM + dd + yyyy ;

        FileWriter fw = new FileWriter("./src/myApp/TodayDateRecorde.txt", true);

        fw.write("\n" + totalDate + " : ");
        fw.close();




    }


    private static String arrangedFormat(String pattern, String format) {
        SimpleDateFormat date = new SimpleDateFormat(pattern);
        return String.format(format, date.format(today));

    }
}

