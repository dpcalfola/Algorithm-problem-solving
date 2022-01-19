package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

// int, long 모두 틀렸습니다
// LinkedList 사용
public class Q4158_failed2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long kNum = Long.parseLong(st.nextToken());
        long sNum = Long.parseLong(st.nextToken());

        LinkedList<String> kList = new LinkedList<>();
        LinkedList<String> sList = new LinkedList<>();

        for (long i = 0; i < kNum; i++) {
            kList.add(br.readLine());
        }

        for (long i = 0; i < sNum; i++) {
            sList.add(br.readLine());
        }

        String garbage = br.readLine();

        kList.retainAll(sList);

        System.out.println(kList.size());
    }
}
