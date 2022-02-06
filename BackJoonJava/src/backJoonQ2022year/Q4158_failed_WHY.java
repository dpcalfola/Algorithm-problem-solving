package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4158_failed_WHY {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] guenCD = new int[n];
        int[] youngCD = new int[m];

        for (int i = 0; i < guenCD.length; i++) {
            guenCD[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < youngCD.length; i++) {
            youngCD[i] = Integer.parseInt(br.readLine());
        }

        String garbage = br.readLine();

        int cnt = 0;
        for (int j = 0; j < youngCD.length; j++) {
            if (hasCDBinarySearch(guenCD, youngCD[j], 0, guenCD.length - 1)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }


    static boolean hasCDBinarySearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return false;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == target) {
            return true;
        } else if (target < arr[mid]) {
            return hasCDBinarySearch(arr, target, low, mid - 1);
        } else {
            return hasCDBinarySearch(arr, target, mid + 1, high);
        }
    }
}
