package backJoonQ2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2869_failed {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");


        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());


        int result = 0;

        if (a >= c) {
            result = 1;

        } else if ((a + b) >= c) {
            result = ((c - b) / (a - b)) + 1;

        } else {
            result = (c - b) / (a - b);
        }

        System.out.println(result);


    }
}


/* a: 올라가는 길이
 *  b: 떨어지는 길이
 *  c: 전체 길이
 * */