package backJoonQ2022year.q10867;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Q10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Set<Integer> set = new TreeSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");

        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

//        for ( Integer i : set){
//            System.out.print(i + " ");
//        }

        // 정규식 "[ 내용물 ]" 을 모두 "" nullString 으로 교체
        // [ ==> \\[ 로 표시
        // 따라서 내용물 ( [ ] , ) 세개는
        // \\[ \\] ,
        // 위 처럼 표현
        System.out.println(set.toString().replaceAll("[\\[\\],]", ""));

    }
}
