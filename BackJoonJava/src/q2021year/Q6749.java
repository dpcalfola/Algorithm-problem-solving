package q2021year;

import java.util.Scanner;

public class Q6749 {
    public static void main(String[] args) {
        int a, b, c ;
        c = 0;

        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = b + (b-a);

        System.out.println(c);

    }
}
