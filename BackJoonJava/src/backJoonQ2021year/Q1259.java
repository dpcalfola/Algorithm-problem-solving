package backJoonQ2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String a = br.readLine();

            if (a.equals("0")) {
                break;
            }

            for (int i = a.length() - 1; i >= 0; i--) {
                sb.append(String.valueOf(a.charAt(i)));
            }

            String b = sb.toString();
//            System.out.println(a);
//            System.out.println(b);


            if (a.equals(b)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

            sb.setLength(0);

        }
    }
}
