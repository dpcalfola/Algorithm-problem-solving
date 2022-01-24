package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q13900_timeOver {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arrSize = Integer.parseInt(br.readLine());
        int[] arr = new int[arrSize];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 배열에서 두 수를 뽑는 모든 경우의수
        // 하나의 수를 뽑고
        // 다음 인덱스에서 마지막 인덱스까지 돈다
        // 두 번쨰 수를 뽑고
        // 다음 인덱스에서 마지막 인덱스까지 돈다

        // 매 경우의 수의 곱을 더한다
        Long sum = 0L;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[i] * arr[j];
//                System.out.println("(" + arr[i] +", " + arr[j] + ") ==> " + arr[i]*arr[j]  );
            }
        }

        System.out.println(sum);
    }
}
