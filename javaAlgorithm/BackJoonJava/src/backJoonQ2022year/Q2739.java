package backJoonQ2022year;

import java.util.Scanner;

public class Q2739 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        for (int i = 1; i < 10 ; i++) {
            System.out.printf("%d * %d = %d\n", N, i, N*i);
        }
    }
}
