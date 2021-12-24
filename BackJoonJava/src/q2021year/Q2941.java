package q2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();

        int leng = a.length();


        String[] arr = a.split("");
        String[] arr2 = new String[a.length() + 1];

        arr2[0] = "0";

        for (int i = 0; i < arr.length; i++) {
            arr2[i + 1] = arr[i];
        }

        for (int i = 0; i < arr2.length; i++) {

//            System.out.println(arr2[i]);

            if (arr2[0].equals("j")) {
                continue;
            }

            if (arr2[i].equals("j") && arr2[i - 1].equals("l") || arr2[i].equals("j") && arr2[i - 1].equals("n")) {
                leng--;
            }
            if (arr2[i].equals("-")) {
                leng--;
            }
            if (arr2[i].equals("=")) {
                if (arr2[i - 1].equals("z") && arr2[i - 2].equals("d")) {
                    leng = leng - 2;
                } else {
                    leng--;
                }
            }

        }

        System.out.println(leng);


//        PrintAllArray.printAllStr(arr);
//        System.out.println(leng);
    }
}
