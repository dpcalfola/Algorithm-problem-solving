package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2864 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String n1 = st.nextToken();
        String n2 = st.nextToken();

        // 최소값 : 6을 모두 5로 바꾼 문자열을 미니멈 변수에 각각 넣는다
        String n1Min = n1.replace("6", "5");
        String n2Min = n2.replace("6", "5");
        // 정수로 바꿔 더한다.
        int min = Integer.parseInt(n1Min) + Integer.parseInt(n2Min);

        // 최대값
        String n1Max = n1.replace("5", "6");
        String n2Max = n2.replace("5", "6");
        int max = Integer.parseInt(n1Max) + Integer.parseInt(n2Max);


        // 출력
        System.out.println(min + " " + max);


    }
}

// 입력은 문자열로 받는다

// 입력받은 수의 5를 모두 6으로 바꾼다
// str = str.replace("5", "6")
// 입력받은 수의 6을 모두 5로 바꾼다