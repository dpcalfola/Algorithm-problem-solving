package backJoonQ2021year;

import java.util.Scanner;

public class Q5522 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        int total = 0;
        for (int i = 0; i < 5; i++) {

            score = scan.nextInt();
            total += score;

        }

        scan.close();

        System.out.println(total);


    }
}

/*
* 표준 입력에서 다음과 같은 데이터를 읽어온다.

i 번째 줄(1 ≤ i ≤ 5)에는 정수 Ai가 적혀있다. 이것은 i번째 게임에서의 JOI군의 점수를 나타낸다.
출력
표준 출력에 JOI군의 총점을 한 줄로 출력하라.

제한
0 ≤ Ai ≤ 100.
서브태스크
번호	배점	제한
1	20
0 ≤ Ai ≤ 10.

2	80
추가적인 제약 조건이 없다.

예제 입력 1
1
2
3
4
5
예제 출력 1
15
예제 입력 2
0
100
0
10
100
예제 출력 2
210
*
* */