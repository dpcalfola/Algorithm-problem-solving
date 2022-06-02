package backJoonQ2022year;

import java.util.Scanner;

public class Q2439 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        for (int i = 1; i <= N; i++) {
            printSpace(i, N);
            printAsterik(i);
            System.out.println();
        }
    }

    private static void printSpace(int index, int N) {
        for (int i = N - index; i > 0; i--) {
            System.out.print(" ");
        }

    }

    private static void printAsterik(int index) {
        for (int i = 1; i <= index; i++) {
            System.out.print("*");
        }

    }
}
