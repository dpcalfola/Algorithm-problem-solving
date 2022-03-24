package backJoonQ2022year.j1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        int numerator;
        int denominator;

        // 그룹찹기
        int ordinal;
        int group = 1;
        int position = 0;

        while (position < N) {
            while (position < N) {
                position += group;
                group++;
            }
        }
        group--;
        ordinal = group - (position - N) - 1;

//        System.out.println("G: "+ group);
//        System.out.println("O: " + ordinal);


        if (group % 2 != 0) {
            // 홀수 그룹일 경우
            numerator = group - ordinal;
            denominator = ordinal + 1;
        } else {
            // 짝수 그룹
            numerator = ordinal + 1;
            denominator = group - ordinal;
        }

        System.out.println(numerator + "/" + denominator);


    }


}


/*   서수 : 0부터
 *
 *   분자:
 *   값 -   1, 12, 321, 1234, 54321
 *   그룹 -  1, 2,   3,    4,   5
 *   만약 입력값이 5라면 => 2 ==> 3 그룹의 1번째수 ===> group - ordinal
 *
 *  분모:
 *   값 -   1, 21, 123, 4321, 12345
 *   그룹 -  1, 2, 3, 4, 5
 *   만약 입력값이 5 라면 => 2 ==> 3 그룹의 1번째 수 ===> ordinal + 1
 *
 * */