package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        // 10,000 짜리 배열을 만들고
        // 포인터용 변수를 생성해서
        // 앞에서부터 채우고 포인터변수에 인덱스번호를 입력

        int[] stack = new int[10000];

        // 스택에 아무것도 없을경우 ===> pointer == -1
        int pointer = -1;


        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine() , " ");
            String order = st.nextToken();

            if (order.contains("push")) {
                pointer++;
                stack[pointer] = Integer.parseInt(st.nextToken());


            } else if (order.contains("pop")) {
                if (pointer == -1) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack[pointer]);
                    pointer--;
                }


            } else if (order.contains("size")) {
                // 스택이 비어있다 ==> 포인터 -1
                // (포인터 == 0) ==> 스택에 1개 들어있음
                System.out.println(pointer + 1);


            } else if (order.contains("empty")) {
                if (pointer == -1) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }


            } else if (order.contains("top")) {
                if (pointer == -1) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack[pointer]);
                }

            }

        }

    }
}
