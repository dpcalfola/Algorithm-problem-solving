package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] nums1 = new int[N];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        int[] nums2 = new int[M];
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = Integer.parseInt(st.nextToken());
        }


        int[] countArr = new int[M];

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    countArr[j]++;
                }
            }
        }

        System.out.println(Arrays.toString(countArr).replaceAll("[\\[\\],]", ""));
    }
}
