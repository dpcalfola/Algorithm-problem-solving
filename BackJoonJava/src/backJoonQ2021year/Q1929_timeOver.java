package backJoonQ2021year;

import java.util.Scanner;

public class Q1929_timeOver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        scan.close();

        boolean checkP = true;

        for (int i = n1; i < n2; i++) {

            for (int j = 2; j < i * 0.5; j++) {
                if (i > 2 && i % 2 == 0) {
                    checkP = false;
                    break;
                } else if (i > 3 && i % 3 == 0) {
                    checkP = false;
                    break;
                } else if (i > 5 && i % 5 == 0) {
                    checkP = false;
                    break;

                } else if (i > 7 && i % 7 == 0) {
                    checkP = false;
                    break;
                } else if (i > 11 && i % 11 == 0) {
                    checkP = false;
                    break;
                } else if (i > 13 && i % 13 == 0) {
                    checkP = false;
                    break;
                } else if (i > 17 && i % 17 == 0) {
                    checkP = false;
                    break;
                } else if (i > 19 && i % 19 == 0) {
                    checkP = false;
                    break;
                } else if (i > 23 && i % 23 == 0) {
                    checkP = false;
                    break;
                }


                if (i % j == 0) {
                    //not Prime Number
                    checkP = false;
                    break;
                }
            }

            if (checkP) {
                System.out.println(i);
            }

            checkP = true;
        }


    }
}
