package backJoonQ2021year;

import java.util.Scanner;

public class Q11720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        String s = scan.next();

        String[] arrStr = s.split("");

        int sum = 0 ;

        for (int i = 0; i < s.length(); i++) {

            sum += Integer.parseInt(arrStr[i]);

        }

        System.out.println(sum);

    }
}
