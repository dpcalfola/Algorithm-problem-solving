package q2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        String a = st.nextToken();
        String b = st.nextToken();

        StringBuilder sb1 = new StringBuilder(a);
        StringBuilder sb2 = new StringBuilder(b);

        int reA =Integer.parseInt(sb1.reverse().toString());
        int reB =Integer.parseInt(sb2.reverse().toString());

        int max = Math.max(reA, reB);

        System.out.println(max);



//        System.out.println(a + b);



    }

}
