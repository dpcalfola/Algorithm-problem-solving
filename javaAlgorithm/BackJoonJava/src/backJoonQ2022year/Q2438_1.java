package backJoonQ2022year;

import java.util.Scanner;

public class Q2438_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        for (int i = 1; i <= N; i++) {
            printStar(i);
            System.out.println();
        }
    }

    private static void printStar(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
}
