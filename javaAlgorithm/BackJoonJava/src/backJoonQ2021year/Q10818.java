package backJoonQ2021year;

import java.util.Scanner;

public class Q10818 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt() ;
        int[] array = new int[n];

        for(int i = 0 ; i < n ; i++) {
            array[i] = scan.nextInt();
        }

        int max = Integer.MIN_VALUE ;
        int min = Integer.MAX_VALUE ;

        for( int i = 0 ; i < n ; i++ ) {
//            System.out.println(array[i]);
            if ( array[i] < min ) {
                min = array[i] ;
            }
            if ( array[i] > max) {
                max = array[i] ;
            }
        }

        System.out.println(min + " " + max);


    }
}
