package myTool;


import java.util.Scanner;

public class Factorial {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        factorial(4);


    }

    public static void factorial(int number) {
        int num = number;
        int result = 1;

        if(num==0 || num==1) {
        }
        else{
            for ( int i = 1 ; i<=num ; i++){
                result *= i;
            }
        }

        System.out.println(result);
    }
}
