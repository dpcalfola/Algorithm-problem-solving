package backJoonQ2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q17608_ReTry {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] stick = new int[N];

        for (int i = 0; i < stick.length; i++) {
            stick[i] = Integer.parseInt(br.readLine());
        }


        int count = 1;

        int max = stick[stick.length - 1];


        for (int i = stick.length - 2; i >= 0; i--) {
            if (stick[i] > max) {
                count++;
                max = stick[i];

            }
        }
        System.out.println(count);

    }
}
