package backJoonQ2021year;

import java.util.Scanner;

public class Q10871 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {



        int N = scan.nextInt();
        int X = scan.nextInt();

        method(N , X);

    }

    public static void method(int N , int X){

        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {

            if ( arr[i] < X){
                System.out.print(arr[i] + " ");
            }

        }
    }
}
