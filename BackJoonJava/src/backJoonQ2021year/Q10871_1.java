package backJoonQ2021year;

import java.util.Scanner;

public class Q10871_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int min = scan.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < N; i++) {

            if (arr[i] < min){

                System.out.print(arr[i] + " ");

            }

        }

    }
}
