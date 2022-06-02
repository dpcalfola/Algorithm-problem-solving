package backJoonQ2021year;

import java.util.Scanner;

public class Q5618 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if (n == 2) {
            int a = scan.nextInt();
            int b = scan.nextInt();


            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    System.out.println(i);
                }

            }
        } else {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b % i == 0 && c % i == 0) {
                    System.out.println(i);
                }

            }


        }


    }
}
