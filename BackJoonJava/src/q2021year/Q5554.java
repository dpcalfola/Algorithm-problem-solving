package q2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5554 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0 ;

        for (int i = 0; i < 4; i++) {
            sum += Integer.parseInt(br.readLine());
        }

        int min = sum/60;
        int sec = sum%60;


        System.out.println(min);
        System.out.println(sec);
    }
}
