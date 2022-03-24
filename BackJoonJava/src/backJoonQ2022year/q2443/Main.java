package backJoonQ2022year.q2443;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(br.readLine());

        for (int i = 0; i < inputNum; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 2*(inputNum-i)-1 ; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
