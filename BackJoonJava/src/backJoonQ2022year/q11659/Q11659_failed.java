package backJoonQ2022year.q11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11659_failed {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int arrSize = Integer.parseInt(st.nextToken());
        int testCase = Integer.parseInt(st.nextToken());
        int[] arr = new int[arrSize];
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int sum = 0;
            int diff = end - start + 1;
            start--; // move start index to 0
            for (int j = 0; j < diff; j++) {
                sum += arr[start++];
            }
            System.out.println(sum);
        }
    }
}

/*
time over

need prefixSum Algorithm

 */