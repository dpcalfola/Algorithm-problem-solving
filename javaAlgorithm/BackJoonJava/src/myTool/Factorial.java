package myTool;


import java.util.Scanner;

public class Factorial {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        factorial(5);


    }

    public static void factorial(int number) {
        int num = number;
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;

        }

        System.out.println(result);
    }
}
