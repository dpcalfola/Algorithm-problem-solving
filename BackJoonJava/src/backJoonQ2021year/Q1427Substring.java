package backJoonQ2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Q1427Substring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();

//        System.out.println(s);

        Integer[] arr = new Integer[s.length()];


        for (int i = 0; i < s.length(); i++) {
            arr[i] = Integer.parseInt(s.substring(i,i+1));
        }


        Arrays.sort(arr, Collections.reverseOrder());


        for (int j : arr) {
            System.out.print(j);
        }


    }
}
