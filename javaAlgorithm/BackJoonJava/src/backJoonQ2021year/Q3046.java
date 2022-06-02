package backJoonQ2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");

        int r = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int result = 2*s - r ;

        System.out.println(result);
    }
}
