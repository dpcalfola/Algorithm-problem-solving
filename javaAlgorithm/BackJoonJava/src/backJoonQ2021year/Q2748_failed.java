package backJoonQ2021year;

import java.io.*;

public class Q2748_failed {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        int[] arr = new int[N + 1];

        arr[0] = 0;
        arr[1] = 1;


        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        System.out.println(arr[N]);


        // result is to small variable




    }
}

/*
* N 번째 피보나치 수
* */