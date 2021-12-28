package backJoonQ2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

//        int num = 5 ;

        for (int line = num; line > 0; line--) {

            for (int j = num ; j > line; j--) {
                System.out.print(" ");

            }
            for (int j = 0; j < line ; j++) {

                System.out.print("*");

            }
            System.out.println();

        }
    }
}


// It is not pretty