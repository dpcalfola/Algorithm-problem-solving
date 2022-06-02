package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Q1822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int numOfA = Integer.parseInt(st.nextToken());
        int numOfB = Integer.parseInt(st.nextToken());

        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < numOfA; i++) {
            set1.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < numOfB; i++) {
            set2.add(Integer.parseInt(st.nextToken()));
        }

        set1.removeAll(set2);
        Object[] arr = set1.toArray();
        System.out.println(set1.size());
        for (Object o : arr) {
            System.out.print(o + " ");
        }
    }
}