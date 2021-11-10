package q2021year;

import java.util.Scanner;

public class Q10950 {
    public static void main(String[] args) {
        int number, a, b;

        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();


        int[] result = new int[number];


        for (int i = 0; i < number; i++) {
            a = scan.nextInt();
            b = scan.nextInt();
            result[i] = a + b;

        }

        for (int i = 0; i < number; i++) {
            System.out.println(result[i]);
        }
    }
}
