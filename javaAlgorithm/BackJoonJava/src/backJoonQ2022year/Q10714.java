package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q10714 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str1 = br.readLine().toLowerCase();
            String str2 = reverseStr(str1);

            if (str1.equals(str2)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }


    }

    private static String reverseStr(String str) {
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        Collections.reverse(list);
        StringBuilder sb = new StringBuilder();

        for (Character s : list) {
            sb.append(s);
        }
        return sb.toString();
    }
}
