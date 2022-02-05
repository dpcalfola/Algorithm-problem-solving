package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Q11425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        TreeSet<String> set = new TreeSet<>();
        String[] mArr = new String[m];

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }
        for (int i = 0; i < mArr.length; i++) {
            mArr[i] = br.readLine();
        }

        int cnt = 0 ;

        for ( String s : mArr){
            if(set.contains(s)){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
