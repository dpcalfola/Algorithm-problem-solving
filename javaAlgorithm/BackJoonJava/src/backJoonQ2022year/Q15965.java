package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q15965 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int maxRangeNum = 40000000;
        int limit = (int) Math.sqrt(maxRangeNum);

        // 배열 선언 및 배열의 인덱스 == 배열의 요소로
        boolean[] arr = new boolean[maxRangeNum + 1];

        // 0 과 1은 미리 소수x 로 초기화
        arr[0] = true;
        arr[1] = true;

        // 체 실행
        for (int i = 2; i <= limit; i++) {
            if (!arr[i]) {
                for (int j = i * i; j <= maxRangeNum; j = j + i) {
                    arr[j] = true;
                }
            }
        }
        //
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i]) {
                list.add(i);
            }
        }
        System.out.println(list.get(N - 1));
    }
}
