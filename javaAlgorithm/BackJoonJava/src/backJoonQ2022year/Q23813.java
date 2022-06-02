package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q23813 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();


        Queue<Character> que = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            que.add(str.charAt(i));
        }

        long sum = 0L;

        for (int i = 0; i < str.length(); i++) {

            // 첫째자리를 빼서 마지막 자리로 보냄
            char temp = que.poll();
            que.offer(temp);

            // 리스트를 문자열로 교체
            String resultSpinStr = que.toString().replaceAll("[\\[\\], ]", "");

            // long 로 타입캐스팅하여 더한다
            sum += Long.parseLong(resultSpinStr);
        }

        System.out.println(sum);

    }
}
/*
숫자를 입력받아 회전시킨 결과들을 모두 더한 값을 출력한다.


*/