package q2021year;

import java.util.Scanner;

public class Q2588 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
        a = scan.nextInt();
        b = scan.nextInt();

        int b1Place, b10place, b100place;

        b1Place = b % 10;
        b100place = b / 100;
        b10place = b / 10 - b100place * 10;


//        System.out.println(b1Place);
//        System.out.println(b10place);
//        System.out.println(b100place);

        int result3, result4, result5, result6;

        result3 = a*b1Place ;
        result4 = a*b10place;
        result5 = a*b100place ;
        result6 = a*b ;

        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);


    }
}
