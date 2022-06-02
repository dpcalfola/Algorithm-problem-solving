package backJoonQ2022year.q10866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q10866 {
    public static void main(String[] args) throws IOException {
        Deque<Integer> deque = new ArrayDeque<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int number = 0;

            switch (st.nextToken()) {
                case "push_front":
                    deque.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    deque.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    number = deque.isEmpty() ? -1 : deque.pollFirst();
                    System.out.println(number);
                    break;
                case "pop_back":
                    number = deque.isEmpty() ? -1 : deque.pollLast();
                    System.out.println(number);
                    break;
                case "size":
                    System.out.println(deque.size());
                    break;
                case "empty":
                    number = deque.isEmpty() ? 1 : 0;
                    System.out.println(number);
                    break;
                case "front":
                    number = deque.isEmpty() ? -1 : deque.peekFirst();
                    System.out.println(number);
                    break;
                case "back":
                    number = deque.isEmpty() ? -1 : deque.peekLast();
                    System.out.println(number);
                    break;
            }
        }

    }
}
