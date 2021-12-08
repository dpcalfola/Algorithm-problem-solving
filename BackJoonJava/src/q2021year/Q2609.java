package q2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");

        int inputA = Integer.parseInt(st.nextToken());
        int inputB = Integer.parseInt(st.nextToken());

        br.close();

        int a = Math.max(inputA,inputB);
        int b = Math.min(inputA,inputB);

        int gcd = 1 ;

        for (int i = 2; i <= b; i++) {

            if (b%i == 0 && a%i == 0 && gcd<i ){
                gcd = i ;
            }

        }
        int lcm = gcd * ( a/gcd) * (b/gcd) ;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}
