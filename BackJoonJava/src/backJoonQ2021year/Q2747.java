package backJoonQ2021year;

import java.io.*;

public class Q2747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        int n1 = 0;
        int n2 = 1;
        int temp;

        for (int i = 0; i < N; i++) {
            temp = n1;
            n1 = n2;
            n2 = temp + n2;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(n1 + "\n");
        bw.flush();
        bw.close();
    }
}

