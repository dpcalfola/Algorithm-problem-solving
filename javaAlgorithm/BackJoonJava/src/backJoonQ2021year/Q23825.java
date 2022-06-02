package backJoonQ2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q23825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        args = br.readLine().split(" ");

        int N = Integer.parseInt(args[0]);
        int M = Integer.parseInt(args[1]);

        int answer = Math.min(N/2 , M/2);

        System.out.println(answer);
    }
}
