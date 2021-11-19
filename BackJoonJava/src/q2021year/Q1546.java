package q2021year;

import java.util.Arrays;
import java.util.Scanner;

public class Q1546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        Double[] arr = new Double[N];
        double sum = 0;
        double maxScore;

        double avg;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextDouble();
        }
        Arrays.sort(arr);
        maxScore = arr[N - 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / maxScore * 100;
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        avg = sum / N;
        System.out.println(avg);


    }
}
