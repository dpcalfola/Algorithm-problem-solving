package q2021year;

import java.util.Scanner;

public class Q10430 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c ;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);

    }
}
