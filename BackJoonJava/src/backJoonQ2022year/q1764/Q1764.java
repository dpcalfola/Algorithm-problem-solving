package backJoonQ2022year.q1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> notHeard = new HashSet<>();
        HashSet<String> notSeen = new HashSet<>();


        for (int i = 0; i < n; i++) {
            notHeard.add(br.readLine());
        }
        for (int i = 0; i < m; i++) {
            notSeen.add(br.readLine());
        }

        notHeard.retainAll(notSeen);
        ArrayList<String> list = new ArrayList<>(notHeard);

        Collections.sort(list);
        System.out.println(list.size());

        for (String s : list) {
            System.out.println(s);
        }
    }
}