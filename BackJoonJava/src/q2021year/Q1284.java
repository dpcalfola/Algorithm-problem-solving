package q2021year;

import java.util.Objects;
import java.util.Scanner;

public class Q1284 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = -1;

        while (input != 0) {

            if (input == 0) {
                break;
            }

            input = scan.nextInt();

            solution(input);


        }

    }

    public static void solution(int n) {


        int result = 0;

        String strLang = String.valueOf(n);
        result = strLang.length() - 1;

//        System.out.println("lenth : " + result);


        String[] arrStr;
        arrStr = String.valueOf(n).split("");


        for (int i = 0; i < arrStr.length; i++) {

            if (Objects.equals(arrStr[i], "1")) {
                result += 2;
            } else if (Objects.equals(arrStr[i], "0")) {
                result += 4;
            } else {
                result += 3;
            }

        }

        if( n == 0 ){
            return;
        }

        result += 2 ;


        System.out.println(result);


    }
}
