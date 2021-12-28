package backJoonQ2021year;

import java.util.Scanner;

public class Q2869_timeOver2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int result = 0;

        if (a >= c) {
            result = 1;

        } else if ((a + b) >= c) {
            result = ((c - b) / (a - b)) + 1;

        } else {
            result = (c - b) / (a - b);
        }

        System.out.println(result);


    }
}


/* a: 올라가는 길이
 *  b: 떨어지는 길이
 *  c: 전체 길이
 * */