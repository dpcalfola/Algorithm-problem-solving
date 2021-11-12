package q2021year;

import java.util.Scanner;

public class Q2562 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = new int[9]; // 9칸의 배열을 만드려면 int[9] 를 넣어야한다 int[8] 아님;;;
        int maxArrayNum = -1 ;
        int max = Integer.MIN_VALUE ;

        for (int i = 0; i < 9; i++) {
            array[i] = scan.nextInt();
        }

        for ( int i = 0 ; i < 9 ; i++) {
            if (array[i] > max ){
                max = array[i];
                maxArrayNum = i ;

            }
        }
        System.out.println(max);
        System.out.print(maxArrayNum+1);


    }
}
