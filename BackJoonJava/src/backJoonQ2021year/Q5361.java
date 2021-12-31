package backJoonQ2021year;

import java.io.IOException;
import java.util.Scanner;

public class Q5361 {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();


        double[] needs = new double[5];
        double total = 0;
        double[] price = {350.34, 230.90, 190.55, 125.30, 180.90};


        for (int i = 0; i < N; i++) {

            for (int j = 0; j < 5; j++) {
                needs[j] = scan.nextInt();
            }

            for (int j = 0; j < 5; j++) {
                total += price[j] * needs[j];
            }

            System.out.printf("$%.2f\n", total);

            total = 0;

        }


    }
}

