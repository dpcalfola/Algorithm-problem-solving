package JungOlQ2021year;

import java.util.Scanner;

public class J518 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt() ;
        int b = scan.nextInt() ;
        int c = scan.nextInt() ;

        int sum = a + b + c ;
        int avg = sum/3 ;

        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);


    }
}
