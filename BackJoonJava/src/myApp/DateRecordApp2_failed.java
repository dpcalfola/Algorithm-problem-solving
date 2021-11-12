package myApp;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRecordApp2_failed {

    public static void main(String[] args) throws IOException {
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("EEEE, MMMM, dd, yyyy : ");


        String strToday = String.format("%-15s", (String) date.format(today));
        System.out.println("Recorde in text : " + strToday);

        FileWriter fw = new FileWriter("TodayDateRecorde2.txt", true);


        fw.write("\n" + strToday);
        fw.close();


    }
}
 //SimpleDateFormat date = new SimpleDateFormat("EEEE, MMMM, dd, yyyy : "); 메서드 혹은 인스턴스 만드는 방법을 익힐것.

