package backJoonQ2022year.q11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11659_PrefixSumArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int arraySize = Integer.parseInt(st.nextToken());
        int testCase = Integer.parseInt(st.nextToken());

        // make Prefix Sum Array at the same time catch input
        int[] prefixSumArray = new int[arraySize];

        st = new StringTokenizer(br.readLine(), " "); // make token

        // put into array index 0 manually
        prefixSumArray[0] = Integer.parseInt(st.nextToken());

        // catch input from index 1
        for (int i = 1; i < prefixSumArray.length; i++) {
            prefixSumArray[i] = prefixSumArray[i - 1] + Integer.parseInt(st.nextToken());
        }

        // check out array -> OK!!
//        System.out.println(Arrays.toString(prefixSumArray));

        // execute cases
        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            int startIndex = Integer.parseInt(st.nextToken()) - 1;
            int endIndex = Integer.parseInt(st.nextToken()) - 1;

            int result = 0;

            if (startIndex == 0) {
                result = prefixSumArray[endIndex];
            } else {
                result = prefixSumArray[endIndex] - prefixSumArray[startIndex - 1];
            }

            System.out.println(result);
        }
    }
}
