package backJoonQ2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q17863 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String result = input.substring(0,3);

        if (result.equals("555")){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
