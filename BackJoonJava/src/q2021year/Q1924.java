package q2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int months = Integer.parseInt(st.nextToken());
        int days = Integer.parseInt(st.nextToken());

        br.close();


        int checkDays = days;

        String[] days28Month = {"2"};
        String[] days30Month = {"4", "6", "9", "11"};

        for (int i = 1; i < months; i++) {

            if (Arrays.asList(days30Month).contains(String.valueOf(i))) {
                checkDays += 30;

            } else if (Arrays.asList(days28Month).contains(String.valueOf(i))) {
                checkDays += 28;

            } else {
                checkDays += 31; // 1, 3, 5, 7, 8, 10, 12월
            }
        }

        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        System.out.println(day[checkDays%7]);

    }
}
