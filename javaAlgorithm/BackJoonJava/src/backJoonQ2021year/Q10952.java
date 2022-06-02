package backJoonQ2021year;

import java.util.Scanner;

public class Q10952 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = -1;
        int b = -1;
        while (true) {
            a = scan.nextInt();
            b = scan.nextInt();

            if ( a==0 && b == 0) break ;
            System.out.println(a+b);
        }


    }
}


/*입력
입력은 여러 개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

입력의 마지막에는 0 두 개가 들어온다.

출력
각 테스트 케이스마다 A+B를 출력한다.

입력
1 1
2 3
3 4
9 8
5 2
0 0

출력
2
5
7
17
7*/