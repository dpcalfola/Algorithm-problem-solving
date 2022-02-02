package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int inputA = Integer.parseInt(st.nextToken());
            int inputB = Integer.parseInt(st.nextToken());

            if (inputA == 0 && inputB == 0) {
                break;
            }

            String answer = getAnswerString(inputA, inputB);
            System.out.println(answer);
        }

    }

    private static String getAnswerString(int n1, int n2) {

        if (n1 > n2) {
            return (n1 % n2 == 0) ? "multiple" : "neither";
        }

        if (n1 < n2) {
            return (n2 % n1 == 0) ? "factor" : "neither";

        }
        return "neither";
    }
}
