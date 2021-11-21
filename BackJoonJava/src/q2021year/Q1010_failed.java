package q2021year;

import java.util.Scanner;

public class Q1010_failed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {

            Long r = scan.nextLong();
            Long n = scan.nextLong();

            Long result = factorial(n)/(factorial(n-r)*factorial(r));
            System.out.println(result);


        }


//        System.out.println( factorial(0L) );


    }

    public static Long factorial(Long num) {
        long result = 1L;
        for (long i = 1L; i <= num; i++) {
            result *= i;
        }
        return result;


    }
}
