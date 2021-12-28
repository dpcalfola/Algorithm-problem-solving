package backJoonQ2021year;

import java.util.Scanner;

public class Q2675 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            int reNum = scan.nextInt();
            String str = scan.next();

            getResult(reNum, str);


        }

    }

    private static void getResult(int reNum, String str) {

        String[] arr = new String[str.length()];
        arr = str.split("");

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < reNum; j++) {
                System.out.print(arr[i]);
            }
        }
        System.out.println();


    }
}

