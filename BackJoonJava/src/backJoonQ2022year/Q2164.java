package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Q2164 {
    public static void main(String[] args) throws IOException {
        Deque<Integer> deque = new ArrayDeque<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            deque.offerLast(i);
        }

        while (deque.size() > 1) {
            deque.pollFirst();
            deque.offerLast(deque.pollFirst());
        }

        System.out.println(deque.getFirst());

    }
}


// 덱을 만든다

// 덱의 사이즈가 1이 남을 때까지 무한 반복문

// 1번 태스크 제일 앞을 버린다. => deque.pollFirst
// 2번 태스크 앞의 숫자를 뒤로 옮긴다
// 덱의 종류는 ArrayDeque