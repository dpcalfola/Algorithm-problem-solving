package q2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2869 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        br.close();

        int result ;


        int d = c - b;

        if (d % (a-b) == 0) {
            // 딱 떨어지는 경우
            result = d / (a - b);

        } else {
            // 딱 떨어지지 않는 경우 : a 보다 작은 값이 남는다.
            result = d / (a - b);
            result++;
        }

        System.out.println(result);

    }
}

/* a: 올라가는 길이
 *  b: 떨어지는 길이
 *  c: 전체 길이
 * */
