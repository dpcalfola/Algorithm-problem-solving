package backJoonQ2022year.q1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1764_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        TreeSet<String> notHeard = new TreeSet<>();
        TreeSet<String> notSeen = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            notHeard.add(br.readLine());
        }
        for (int i = 0; i < m; i++) {
            notSeen.add(br.readLine());
        }
        notHeard.retainAll(notSeen);

        System.out.println(notHeard.size());
        for (String s : notHeard) {
            System.out.println(s);
        }

    }
}
