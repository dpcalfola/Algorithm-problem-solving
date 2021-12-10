package q2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());


        int arrCount = 0;
        int answer = 0;

        for (int i = 1; i <= N; i++) {

            if (N % i == 0 && arrCount < K) {
                arrCount++;
                answer = i;
            }
        }


        if (arrCount < K) {
            System.out.println(0);
        } else {
            System.out.println(answer);
        }


    }
}
