package backJoonQ2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2231_failed {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());
        int inputNumLength = (int) (Math.log10(inputNum) + 1);

        int[] arrInNumDigit = new int[inputNumLength];


        int answerCheck = 0;

//        System.out.println(arrInNumDigit.length);
//
//        arrInNumDigit[arrInNumDigit.length-1] = getDigitNum(inputNum, arrInNumDigit.length-1);
//        System.out.println(arrInNumDigit[arrInNumDigit.length-1]);
//
//        arrInNumDigit[0] = getDigitNum(123, 0);
//        System.out.println(arrInNumDigit[0]);


        // for start
        for (int i = 1; i <= inputNum; i++) {


            int digitSum = 0;

            for (int j = 0; j < arrInNumDigit.length; j++) {
                digitSum = 0;
                digitSum += arrInNumDigit[j];
            }

            answerCheck = i + digitSum;

            if (inputNum == answerCheck) {
                System.out.println(i);
                break;
            }

        }
        // for end

//        for (int j = 0; j < arrInNumDigit.length-1 ; j++) {
//            System.out.println(arrInNumDigit[j]);
//        }

//        System.out.println(Integer.MAX_VALUE);


    }

    private static int getDigitNum(int n, int i) {
        String str = String.valueOf(n);
        String[] arrStr = str.split("");

        int result = Integer.parseInt(arrStr[i]);

        return result;

        // 정수의 가장 앞자리 index 가 0 부터 시작

    }
}
