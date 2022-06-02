package backJoonQ2021year;

import java.util.Scanner;

public class Q14681 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, q;
        a = scan.nextInt();
        b = scan.nextInt();

        if (a > 0 && b > 0) {
            q = 1;
        } else if ( a <0 && b > 0) {
            q = 2 ;
        } else if ( a < 0 && b < 0) {
            q = 3 ;
        } else {
            q = 4 ;
        }

        System.out.println(q);
    }



}
