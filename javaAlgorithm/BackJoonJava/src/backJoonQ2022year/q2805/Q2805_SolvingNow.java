package backJoonQ2022year.q2805;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2805_SolvingNow {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int numberOfTree = Integer.parseInt(st.nextToken());
        int needLength = Integer.parseInt(st.nextToken());

        int[] treeLength = new int[numberOfTree];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < treeLength.length; i++) {
            treeLength[i] = Integer.parseInt(st.nextToken());
        }


        System.out.println(Arrays.toString(treeLength));
    }


    static int binarySearchInt(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (target < arr[mid]) {
            return binarySearchInt(arr, target, low, mid - 1);
        } else {
            return binarySearchInt(arr, target, mid + 1, high);
        }
    }

    static int takes (int[] arr, int h ) {
        int sum = 0 ;
        for (int j : arr) {
            sum += j - h;
        }
        return sum ;
    }
}



/*


높이 h 로 자른다

Length - h = 가져가는 길이 (takes)

isEnough = Sum(takes) > needLength


    if (isEnough)
        -> h 를 올린다

    else
         -> h 를 내린다


올라가다 내려가면 최대값 ?
내려가다 올라가면 최대값 ?



5 20
4 42 40 26 46

40 으로 자르면 0, 2, 0, 6 -> 8로 모자르다
20 으로 자르면 0, 22, 20, 6, 26 - > 많이 남는다
30 으로 자르면 0, 12, 10, 0, 16 -> 많이 으로 남는다
35 으로 자르면 0, 12, 5, 0, 11 -> 27 // 남는다
37 으로 자르면 0, 5, 3, 0, 9 -> 17 // 모자르다
36                              // 남는다








 */