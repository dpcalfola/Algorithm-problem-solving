package q2021year;

import java.io.*;
import java.util.Arrays;

public class Q5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] burger = new int[3];
        int[] drink = new int[2];

        for (int i = 0; i < burger.length; i++) {
            burger[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < drink.length; i++) {
            drink[i] = Integer.parseInt(br.readLine());

        }

        br.close();

        Arrays.sort(burger);
        Arrays.sort(drink);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(burger[0] + drink[0] -50 + " ");
        bw.flush();
        bw.close();
    }
}
