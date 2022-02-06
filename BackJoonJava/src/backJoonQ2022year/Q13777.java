package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q13777 {
    public static void main(String[] args) throws IOException {

        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int targetNumber = Integer.parseInt(br.readLine());
            if (targetNumber == 0) {
                break;
            }
            int result = binarySearchInt(arr, targetNumber, 0, arr.length - 1);
        }
    }

    static int binarySearchInt(int[] arr, int targetNum, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;
        System.out.print(mid + 1 + " ");

        if (arr[mid] == targetNum) {
            System.out.println();
            return mid;
        } else if (targetNum < arr[mid]) {
            return binarySearchInt(arr, targetNum, low, mid - 1);
        } else {
            return binarySearchInt(arr, targetNum, mid + 1, high);
        }
    }
}
