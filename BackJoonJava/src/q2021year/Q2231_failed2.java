package q2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2231_failed2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());


        for (int i = 0; i < inputNum; i++) {

            int iLength = (int) (Math.log10(i) + 1);

            int[] digit = new int[iLength];

            for (int j = 0; j < iLength; j++) {
                digit[j] = getDigitNum(i,j);
                System.out.println(i + " " + j);
            }

//
//            int sum = 0 ;
//
//            sum = i + digit[0] + digit[1] ;
//
//
//
//
//            if(sum == inputNum){
//                System.out.println(i);
//                break;
//            }





        }
    }

    private static int getDigitNum(int n, int i) {
        String str = String.valueOf(n);
        String[] arrStr = str.split("");

        int result = Integer.parseInt(arrStr[i]);

        return result;

        // 정수의 가장 앞자리 index 가 0 부터 시작

    }
}
