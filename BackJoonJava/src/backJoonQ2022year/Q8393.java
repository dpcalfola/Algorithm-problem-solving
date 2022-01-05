package backJoonQ2022year;

import java.util.Scanner;

public class Q8393 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        scan.close();

        int sum = 0;

        for (int i = 0; i <= N; i++) {
            sum += i;
        }

        System.out.println(sum);




    }
}
