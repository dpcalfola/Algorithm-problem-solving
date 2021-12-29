package backJoonQ2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10809 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine() ;
        String[] arrStr = str.split("");
//        PrintAllArray.printAllStr(arrStr);

        checkAlpha(sb, arrStr, "a");
        checkAlpha(sb, arrStr, "b");
        checkAlpha(sb, arrStr, "c");
        checkAlpha(sb, arrStr, "d");
        checkAlpha(sb, arrStr, "e");
        checkAlpha(sb, arrStr, "f");
        checkAlpha(sb, arrStr, "g");
        checkAlpha(sb, arrStr, "h");
        checkAlpha(sb, arrStr, "i");
        checkAlpha(sb, arrStr, "j");
        checkAlpha(sb, arrStr, "k");
        checkAlpha(sb, arrStr, "l");
        checkAlpha(sb, arrStr, "m");
        checkAlpha(sb, arrStr, "n");
        checkAlpha(sb, arrStr, "o");
        checkAlpha(sb, arrStr, "p");
        checkAlpha(sb, arrStr, "q");
        checkAlpha(sb, arrStr, "r");
        checkAlpha(sb, arrStr, "s");
        checkAlpha(sb, arrStr, "t");
        checkAlpha(sb, arrStr, "u");
        checkAlpha(sb, arrStr, "v");
        checkAlpha(sb, arrStr, "w");
        checkAlpha(sb, arrStr, "x");
        checkAlpha(sb, arrStr, "y");
        checkAlpha(sb, arrStr, "z");



        System.out.println(sb);

    }

    private static void checkAlpha(StringBuilder sb, String[] arrStr, String s) {
        String checkStr = sb.toString();
        for (int i = 0; i < arrStr.length; i++) {
            if(arrStr[i].equals(s)){
                sb.append(i + " ");
                break;

            }

        }

        if(checkStr.equals(sb.toString())){
            sb.append(-1 + " ");
        }
    }
}
