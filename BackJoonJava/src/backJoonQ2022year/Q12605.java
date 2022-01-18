package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            ArrayList<String> list = new ArrayList<>();

            while (st.hasMoreTokens()) {
                list.add(st.nextToken());
            }
            Collections.reverse(list);
            System.out.printf("Case #%d: ", i + 1);
            for (String s : list) {
                System.out.print(s + " ");

            }
            System.out.println();
        }
    }
}
