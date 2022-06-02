package backJoonQ2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int distanceV = h - y; // 위로 걸어가는 거리
        int distanceH = w - x; // 오른쪽으로 걸어가는 거리
        // 왼쪽으로 걸어가는 거리 : x
        // 아래로 걸어가는 거리 : y

        int midAnswer = Math.min(distanceH, distanceV);
        int midAnswer2 = Math.min(x, y);
        int answer = Math.min(midAnswer, midAnswer2);


        System.out.println(answer);


    }
}



/*
* 한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다. 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 x, y, w, h가 주어진다.

출력
첫째 줄에 문제의 정답을 출력한다.

제한
1 ≤ w, h ≤ 1,000
1 ≤ x ≤ w-1
1 ≤ y ≤ h-1
x, y, w, h는 정수
예제 입력 1
6 2 10 3
예제 출력 1
1
예제 입력 2
1 1 5 5
예제 출력 2
1
예제 입력 3
653 375 1000 1000
예제 출력 3
347
예제 입력 4
161 181 762 375
예제 출력 4
161
*
* */
