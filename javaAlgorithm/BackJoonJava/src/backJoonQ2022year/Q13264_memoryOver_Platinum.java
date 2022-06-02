package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Q13264_memoryOver_Platinum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        ArrayList<String> strList = new ArrayList();
        for (int i = 0; i < str.length(); i++) {
            strList.add(str.substring(i));
        }

//        System.out.println(strList);
        String[] sorted = strList.toArray(new String[0]);
        Arrays.sort(sorted);

        for (String a : sorted) {
            System.out.println(strList.indexOf(a));
        }
    }
}
