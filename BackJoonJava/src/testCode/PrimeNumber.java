package testCode;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt() ;
        int n2 = scan.nextInt() ;
        scan.close();

        boolean checkP = true ;

        for (int i = n1 ; i < n2 ; i++){
            for ( int j = 2 ; j < i*0.5 ; j++){
                if (i%j==0){
                    //not Prime Number
                    checkP = false;
                    break;
                }
            }

            if(checkP){
                System.out.println(i);
            }

            checkP = true ;
        }


    }
}
