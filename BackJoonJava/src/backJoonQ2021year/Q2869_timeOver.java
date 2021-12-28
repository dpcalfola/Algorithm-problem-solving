package backJoonQ2021year;

import java.util.Scanner;

public class Q2869_timeOver {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int result = 0 ;

        scan.close();

        for (int i = 1; i < Integer.MAX_VALUE; i++) {

            if(a >= c){
                result = i ;
                break;
            }

            c = c-a+b ;
        }


        System.out.println(result);



    }
}

/* a: 올라가는 길이
*  b: 떨어지는 길이
*  c: 전체 길이
* */
