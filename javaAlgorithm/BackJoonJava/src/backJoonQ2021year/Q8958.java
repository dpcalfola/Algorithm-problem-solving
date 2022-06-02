package backJoonQ2021year;

import java.util.Scanner;


public class Q8958 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {

            checkOXScore(scan.next());
        }

    }

    private static void checkOXScore(String input) {


        String[] arrStr = input.split("");

        int total = 0;
        int cntSeries = 0;

        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].equals("O")) {
                cntSeries++;
                total += cntSeries;
            } else {
                cntSeries = 0;
            }
        }

        System.out.println(total);

    }
}
