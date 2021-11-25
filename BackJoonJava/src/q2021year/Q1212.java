package q2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1212 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringBuilder sb = new StringBuilder();


        String octStr = br.readLine();
        String[] arrStr = octStr.split("");


        String[] octToBi = {"000", "001", "010", "011", "100", "101", "110", "111"};


        for (int i = 0; i < arrStr.length; i++) {
            int temp = Integer.parseInt(arrStr[i]);
//            System.out.println("temp : " + temp);
//            System.out.println("octTobi " + octToBi[temp]);
            sb.append(octToBi[temp]);
        }

//        System.out.println(sb.toString());


        if (sb.toString().charAt(0) - '0' == 0) {
            sb.deleteCharAt(0);
        }
        if (sb.toString().charAt(0) - '0' == 0) {
            sb.deleteCharAt(0);
        }

        System.out.println(sb.toString());


    }


}

