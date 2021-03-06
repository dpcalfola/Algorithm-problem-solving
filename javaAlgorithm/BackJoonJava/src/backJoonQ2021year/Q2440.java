package backJoonQ2021year;

import java.util.Scanner;

public class Q2440 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        for (int j = 0; j < num; j++) {
            for (int i = num; i-j > 0; i--) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}



/*
* 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

예제 입력 1
5
예제 출력 1
*****
****
***
**
*

* *
*
*
*
* */