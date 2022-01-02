package backJoonQ2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q24039 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int n1 = 0;
        int n2 = 0;


        while (true) {

            for (int i = n1; ; i++) {
                if (isPrime(i)) {
                    n1 = i;
                    break;
                }
            }

            for (int i = n1 + 1; ; i++) {
                if (isPrime(i)) {
                    n2 = i;
                    break;
                }
            }

            if (n1 * n2 > N) {
                System.out.println(n1 * n2);
                break;
            } else {
                n1 = n2;
            }

        }


    }


    private static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}




