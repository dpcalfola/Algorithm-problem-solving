package q2021year;

import java.util.Scanner;

public class Q10952_failed1 {
    static int repeat = 1;
    static int[] result = new int[repeat];
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int a = -1;
        int b = -1;


        while (a != 0 && b != 0) {

            for (int i = 0; i <= repeat; i++) {

                a = scan.nextInt();
                b = scan.nextInt();
                result[i] = a + b;
                repeat++;
            }

        }
        for (int i = 0; i <= repeat; i++) {
            System.out.println(result[i]);
        }


    }
}
