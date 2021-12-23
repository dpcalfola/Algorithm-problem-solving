package q2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Formatter;

public class Q3029 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputA = br.readLine();
        String inputB = br.readLine();
        br.close();


//        String inputA = "12:34:56";
//        String inputB = "14:36:22";

        String[] arrStrA = inputA.split(":");
        String[] arrStrB = inputB.split(":");

//        PrintAllArray.printAllStr(arrStrA);
//        PrintAllArray.printAllStr(arrStrB);

        int secA =
                Integer.parseInt(String.valueOf(arrStrA[0])) * 60 * 60
                        + Integer.parseInt(String.valueOf(arrStrA[1])) * 60
                        + Integer.parseInt(String.valueOf(arrStrA[2]));

        int secB =
                Integer.parseInt(String.valueOf(arrStrB[0])) * 60 * 60
                        + Integer.parseInt(String.valueOf(arrStrB[1])) * 60
                        + Integer.parseInt(String.valueOf(arrStrB[2]));


//        System.out.println(secA);
//        System.out.println(secB);

        int dayTimeSec = 24 * 60 * 60;


        int timeGap = 0;

        if (secB > secA) {
            timeGap = secB - secA;
        } else if (secB == secA) {
            timeGap = 60 * 60 * 24;

        } else {
            timeGap = secB + dayTimeSec - secA;
        }


//        System.out.println(timeGap);

        int[] answer = new int[3];

//        answer[0] = timeGap / (60 * 60);
//        answer[1] = timeGap % (60 * 60) / 60;
//        answer[2] = timeGap % (60 * 60) % 60;


        answer[0] = (timeGap / 60) / 60;
        answer[1] = (timeGap / 60) % 60;
        answer[2] = timeGap % 60;


//        PrintAllArray.printAllInt(answer);

        Formatter fm = new Formatter();

        fm.format("%1$02d:%2$02d:%3$02d", answer[0], answer[1], answer[2]);

        System.out.println(fm);


    }
}