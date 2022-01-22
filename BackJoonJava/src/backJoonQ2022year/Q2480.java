package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        if (arr[0] == arr[1] & arr[1] == arr[2]) {
            //3개가 같을 경우
            System.out.println(10000 + arr[0] * 1000);


        } else if (arr[0] == arr[1] || arr[1] == arr[2]) {
            //2개가 같을 경우
            //정렬된 배열: 1, 2번이 같을 경우는 없다.
            //1번 인덱스 숫자는 은 반드시 포함
            System.out.println(1000 + arr[1] * 100);
        } else {
            // 정렬된 배열: 2번 인덱스 값이 항상 최대값
            System.out.println(arr[2] * 100);
        }
    }
}
