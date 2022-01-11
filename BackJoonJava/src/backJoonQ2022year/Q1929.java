package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1929 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        int[] arr = primeArr(n2);

        for (int i = n1; i <= n2; i++) {
            if (arr[i] != -1) {
                System.out.println(arr[i]);
            }
        }
    }


    private static int[] primeArr(int maxRangeNum) {

        // 리미트: 최대값의 루트값
        int limit = (int) Math.sqrt((double) maxRangeNum);

        // 배열 선언 및 배열의 인덱스 == 배열의 요소로
        int arr[] = new int[maxRangeNum + 1];
        for (int i = 0; i <= maxRangeNum; i++) {
            arr[i] = i;
        }

        // 0 과 1은 미리 소수x 로 초기화
        arr[0] = -1;
        arr[1] = -1;


        // 체 실행 (소수가 아닌 수는 -1로 바꾸며 전진)
        for (int i = 2; i <= limit; i++) {
            if (arr[i] != -1) {
                for (int j = i * i; j <= maxRangeNum; j = j + i) {
                    arr[j] = -1;
                }
            }
        }
        return arr;
    }
}
