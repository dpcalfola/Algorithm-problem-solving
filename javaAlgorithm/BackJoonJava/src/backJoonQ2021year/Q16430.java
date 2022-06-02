package backJoonQ2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q16430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int P = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        br.close();

        System.out.printf("%d %d", Q - P, Q);

    }
}
