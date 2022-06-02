package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q3047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] numArr = new int[3];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        String str = br.readLine();
        Arrays.sort(numArr);

        switch (str.charAt(0)) {
            case 'A':
                System.out.print(numArr[0] + " ");
                switch (str.charAt(1)) {
                    case 'B':
                        System.out.print(numArr[1] + " ");
                        System.out.print(numArr[2] + " ");
                        break;
                    default:
                        System.out.print(numArr[2] + " ");
                        System.out.print(numArr[1] + " ");
                }
                break;
            case 'B':
                System.out.print(numArr[1] + " ");
                switch (str.charAt(1)) {
                    case 'A':
                        System.out.print(numArr[0] + " ");
                        System.out.print(numArr[2] + " ");
                        break;
                    default:
                        System.out.print(numArr[2] + " ");
                        System.out.print(numArr[0] + " ");
                }
                break;
            case 'C':
                System.out.print(numArr[2] + " ");
                switch (str.charAt(1)) {
                    case 'A':
                        System.out.print(numArr[0] + " ");
                        System.out.print(numArr[1] + " ");
                        break;
                    default:
                        System.out.print(numArr[1] + " ");
                        System.out.print(numArr[0] + " ");
                }
                break;
        }

    }
}
