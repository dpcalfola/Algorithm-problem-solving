package backJoonQ2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1436_yet {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0 ;
        int number = 665 ;
        String strNum = "";

        int indexOf666 = -1 ;

        boolean check666 = false ;

        while (N == count){

            number++ ;

            strNum = String.valueOf(number);
            indexOf666 = strNum.indexOf("666");

            // 문자열로 변환된 숫자가 666을 가지고 있다면
            if(indexOf666 >= 0){
                check666 = true ;
                count++;

            }



             ;
        }



//        int number = 199966600 ;
//        String strNum = String.valueOf(number);
//
//        System.out.println(strNum.indexOf("666"));



    }
}
