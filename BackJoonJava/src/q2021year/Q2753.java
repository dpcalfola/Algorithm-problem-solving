package q2021year;

import java.util.Scanner;

public class Q2753 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int year = scan.nextInt();
        int result = 0 ;
        if (((year%4 == 0) && (year%100 !=0)) || ((year%4==0) && (year%400 == 0))){
            result = 1 ;

        }
        System.out.println(result);
    }
}
