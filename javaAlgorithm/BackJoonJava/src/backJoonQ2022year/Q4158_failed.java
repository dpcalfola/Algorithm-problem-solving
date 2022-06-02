package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

// 해시셋, 트리셋 이용
// 틀렸습니다
public class Q4158_failed {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int kNum = Integer.parseInt(st.nextToken());
        int sNum = Integer.parseInt(st.nextToken());

        int[] kArr = new int[kNum];
        int[] sArr = new int[sNum];


        for (int i = 0; i < kArr.length; i++) {
            kArr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = Integer.parseInt(br.readLine());
        }

        String garbage = br.readLine();

        Set<Integer> kSet = new TreeSet<>();

        for (int k : kArr){
            kSet.add(k);
        }

        int cnt = 0 ;

        for (int j : sArr) {
            if (kSet.contains(j)) {
                cnt++;
            }
        }

        System.out.println(cnt);


//        System.out.println(kSet);
//        System.out.println(kArr[0]);
//        System.out.println(sArr[0]);

    }
}
