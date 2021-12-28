package backJoonQ2021year;

import myTool.PrintAllArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

public class Q1157_failed {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        String[] arrStr = new String[input.length()+1];

        input = input.toUpperCase();


        for (int i = 0; i < arrStr.length-1; i++) {
            arrStr[i] = String.valueOf(input.charAt(i));
        }

        arrStr[arrStr.length-1] = "]";

        Arrays.sort(arrStr);





        int count = 1;
        int maxCount = 1;

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < arrStr.length-1; i++) {

            if (Objects.equals(arrStr[i], arrStr[i + 1])) {
                count++;

                if (maxCount < count) {
                    maxCount++;
                    sb.append(arrStr[i]);
                }

                System.out.println(arrStr[i] + " " + maxCount);
            } else {
                count = 1;
            }


        }

        System.out.println("maxCount : " + maxCount);

        System.out.println("sb : " + sb.toString());

        System.out.println("=======================");
        PrintAllArray.printAllStr(arrStr);
    }
}
