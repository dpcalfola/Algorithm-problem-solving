package backJoonQ2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q20540 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();
        String[] arrS = str.split("");

        if(arrS[0].equals("E")){
            arrS[0] = "I";
        }else{
            arrS[0] = "E";
        }

        if(arrS[1].equals("S")){
            arrS[1] = "N";
        }else{
            arrS[1] = "S";
        }

        if(arrS[2].equals("T")){
            arrS[2] = "F";
        }else{
            arrS[2] = "T";
        }

        if(arrS[3].equals("J")){
            arrS[3] = "P";
        }else{
            arrS[3] = "J";
        }

        for (int i = 0; i < arrS.length; i++) {
            System.out.print(arrS[i]);
        }

    }
}
