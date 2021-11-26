package q2021year;

import java.util.Scanner;

public class Q1712 {
    public static void main(String[] args) {

//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(2100000000);

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int numOfMade = 0;

        int pureIncome = 0;

        if (b >= c) {
            System.out.println(-1);

        } else {
            while (pureIncome <= a) {


                pureIncome = (c - b) * numOfMade;

                numOfMade++;
            }
            System.out.println(numOfMade-1);
        }


    }
}
