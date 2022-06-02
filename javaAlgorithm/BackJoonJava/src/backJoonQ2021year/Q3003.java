package backJoonQ2021year;

import java.io.*;
import java.util.StringTokenizer;

public class Q3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        br.close();

        arr[0] = 1 - arr[0];
        arr[1] = 1 - arr[1];
        arr[2] = 2 - arr[2];
        arr[3] = 2 - arr[3];
        arr[4] = 2 - arr[4];
        arr[5] = 8 - arr[5];

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + " ");
        }


        bw.flush();
        bw.close();

    }
}
