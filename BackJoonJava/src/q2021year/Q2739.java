package q2021year;

import java.util.Scanner;

public class Q2739 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        for (int i = 1 ; i < 10 ; i++){
            System.out.println(N + " * " + i + " = " + N*i);
        }

    }
}
