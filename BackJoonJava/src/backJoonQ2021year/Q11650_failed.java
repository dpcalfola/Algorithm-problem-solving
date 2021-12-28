/*
*
*
*
  5
  3 4
  1 1
  1 -1
  2 2
  3 3
*
* */


package backJoonQ2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q11650_failed {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);


        int N = Integer.parseInt(br.readLine());


        StringBuilder sb = new StringBuilder();

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {

            String inputStr1 = scan.next();
            String inputStr2 = scan.next();

            String temp;

            sb.append(inputStr1);
            sb.append(inputStr2);

            temp = sb.toString();
            sb.setLength(0);

            arr[i] = temp;
        }

//        PrintAllArray.printAllStr(arr);



    }
}
