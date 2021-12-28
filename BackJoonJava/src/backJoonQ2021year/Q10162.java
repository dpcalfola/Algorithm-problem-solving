package backJoonQ2021year;

import java.util.Scanner;

public class Q10162 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;


        if (t % 10 != 0) {
            System.out.println(-1);
        } else {

            while (t / 300 != 0) {
                t -= 300;
                a++;
            }
            while (t / 60 != 0) {
                t -= 60;
                b++;
            }
            while (t / 10 != 0) {
                t -= 10;
                c++;
            }

            System.out.print(a + " " + b + " " + c);

        }


    }


}



/*
 * A : 300 sec
 * B : 60 sec
 * C : 10 sec
 *
 * */
