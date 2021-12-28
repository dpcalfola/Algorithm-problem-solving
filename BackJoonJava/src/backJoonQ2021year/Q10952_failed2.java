package backJoonQ2021year;

import java.util.Scanner;

public class Q10952_failed2 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int a = -1;
        int b = -1;
        int count = 0 ;
        int[] result = new int[count];


        while (a != 0 && b != 0) {

            a = scan.nextInt();
            b = scan.nextInt();
            result[count] = a+b ;
            count++ ;

        }

        for ( int i = 0 ; i < count ; i++){
            System.out.println(result[i]);
        }
    }
}
