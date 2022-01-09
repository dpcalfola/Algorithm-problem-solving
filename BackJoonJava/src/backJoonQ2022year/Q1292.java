package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        int answer = sumOfNums(n2) - sumOfNums(n1 - 1);
        System.out.println(answer);
    }


    private static int sumOfNums(int n) {

        if (n == 1) {
            return 1;
        }

        int group = 1;
        int sum = 0;

        for (int i = 1; ; i++) {
            if (i * (i + 1) / 2 >= n) {
                break;
            }
            group++;
        }

        int cnt = n - ((group - 1) * group) / 2;

        for (int i = 1; i < group; i++) {
            sum += i * i;
        }

        sum += group * cnt;

        return sum;
    }
}
