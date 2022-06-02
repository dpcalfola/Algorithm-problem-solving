package backJoonQ2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {

            printArrAll(greedAlgo(Integer.parseInt(br.readLine())));
            System.out.println();


        }


    }

    private static int[] greedAlgo(int a) {

        int[] unit = new int[]{25, 10, 5, 1};
        int[] count = new int[unit.length];

        for (int i = 0; i < unit.length; i++) {

            while (a >= unit[i]) {
                a -= unit[i];
                count[i]++;
            }

        }
        return count;
    }

    private static void printArrAll(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
