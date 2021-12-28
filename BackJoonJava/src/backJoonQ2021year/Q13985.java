package backJoonQ2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q13985 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine() ;

        int a = Integer.parseInt(String.valueOf(input.charAt(0)));
        int b = Integer.parseInt(String.valueOf(input.charAt(4)));
        int c = Integer.parseInt(String.valueOf(input.charAt(8)));

//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

        int answer = a+b ;

        if (answer == c){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }


    }
}
