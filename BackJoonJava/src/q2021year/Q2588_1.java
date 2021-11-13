package q2021year;

import java.util.Scanner;

public class Q2588_1 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int a = scan.nextInt();
        int b = scan.nextInt();
        int b1 = b%10 ; // 1의 자리
        int b10 = (b/10)%10 ; // 10의자리
        int b100 = b/100 ; // 100의 자리

        int result3, result4, result5, result6 ;

        result3 = a*b1;
        result4 = a*b10 ;
        result5 = a*b100 ;
        result6 = a*b ;

        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);

    }
}
