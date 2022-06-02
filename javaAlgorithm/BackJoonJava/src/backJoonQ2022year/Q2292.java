package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 인풋 1 ==> 1을 출력하고 종료
        if (n == 1) {
            System.out.println(1);
            return;
        }


        //끝자리 숫자 = 이전 숫자 + 그룹*6

        int endNum = 1;
        int group = -1;

        while (true) {

            group++;

            // 엔드 넘버가 인풋 넘버를 넘어가는 순간 브레이크
            // 인풋 2 ===>> 엔드넘버 7에서 브레이크 : 1그룹
            // 인풋 7 ===>> 1그룹에서 브레이크 ===> 엔드넘버 7에서 종료되야함
            // <= //
            // 인풋 13 ===> 엔드넘버 19에서 브레이크 : 2그룹


            if (n <= endNum) {
                break;
            }
            endNum = endNum + 6 * group;

        }

        System.out.println(group);

    }
}
