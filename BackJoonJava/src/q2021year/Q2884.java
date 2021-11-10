package q2021year;

import java.util.Scanner;

public class Q2884 {
    public static void main(String[] args) {
        int a, b, resultA, resultB, totalMin, resultMin;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        scan.close();

        if(a==0){
            a += 24;
        }


        totalMin = a*60 + b ;
        resultMin = totalMin - 45 ;
        resultA = resultMin/60;
        resultB = resultMin%60;

        if ( resultA == 24 ) {
            resultA = 0;
        }

        System.out.println(resultA + " " + resultB);


    }
}
