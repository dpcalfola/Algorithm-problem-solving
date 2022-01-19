package backJoonQ2022year;

import java.io.*;
import java.util.LinkedList;

public class Q2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // LinkedList 와 ArrayList 사이에는 유의미한 차이가 보이지 않음
//        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }


        while (list.size() != 1) {
            System.out.print(list.get(0) + " ");
            list.remove(0);
            list.add(list.get(0));
            list.remove(0);

        }

        System.out.print(list.get(0) + " ");

    }
}
