package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int caseNum = Integer.parseInt(br.readLine());
            if (caseNum == 0) {
                break;
            }

            boolean[] result = primeArr(caseNum * 2);
            int count = 0;

            // caseNum 보다 크고...
            for (int i = caseNum+1; i < result.length; i++) {

                // result[i]가 false 면 소수
                if (!result[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    // 체 메써드, index == 숫자
    private static boolean[] primeArr(int max) {

        // boolean 의 default => false
        boolean[] arr = new boolean[max+1];
        int limit = (int) Math.sqrt(max);

        // 0과 1을 소수로 마킹
        arr[0] = true;
        arr[1] = true;

        for (int i = 2; i <= limit; i++) {
            // i가 소수일 경우
            if (!arr[i]) {
                // 소수의 제곱부터 최대범위까지 걸어가며 지운다
                for (int j = i * i; j <= max; j = j + i) {
                    arr[j] = true;
                }
            }
        }
        return arr;
    }
}
