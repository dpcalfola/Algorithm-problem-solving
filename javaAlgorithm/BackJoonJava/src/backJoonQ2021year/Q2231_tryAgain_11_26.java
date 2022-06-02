package backJoonQ2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2231_tryAgain_11_26 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());
        int answer = 0;


        for (int i = 0; i < inputNum; i++) {
            int result = i + sumOfDigit(i);

            if (result == inputNum) {
                answer = i;
                break;
            }

        }

        System.out.println(answer);


    }


    private static int sumOfDigit(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }


}

