package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

public class Q7120 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] strArr = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            strArr[i] = String.valueOf(str.charAt(i));

        }

        for (int i = 0; i < strArr.length-1; i++) {
            if(Objects.equals(strArr[i], strArr[i + 1]) && !Objects.equals(strArr[i], "0")){
                strArr[i] = "0";
            }
        }

        ArrayList<String> answerList = new ArrayList<>();

        for ( String s : strArr){
            if (s != "0"){
                answerList.add(s);
            }
        }

        for (int i = 0; i < answerList.size(); i++) {
            System.out.print(answerList.get(i));
        }

    }
}
