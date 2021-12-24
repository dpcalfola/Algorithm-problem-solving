package q2021year;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2941_copied {
    /*
     * 2941번 문제
     * 문제 URL : https://www.acmicpc.net/problem/2941
     */
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String word = br.readLine();
            String[] wordList = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

            for (int idx = 0; idx < wordList.length; idx++) {
                word = word.replaceAll(wordList[idx], "*");
            }

            System.out.println(word.length());

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

