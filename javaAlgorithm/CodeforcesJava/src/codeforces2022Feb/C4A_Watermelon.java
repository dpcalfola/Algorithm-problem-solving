package codeforces2022Feb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C4A_Watermelon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(br.readLine());

        if (inputNum == 2) {
            System.out.println("NO");

        } else if (inputNum % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
