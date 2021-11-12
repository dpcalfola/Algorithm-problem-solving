package q2021year;

import java.util.Scanner;

public class Q2577 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        int num = a * b * c;

//        System.out.println(num);

        String strNum = Integer.toString(num);

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < strNum.length(); j++) {
                if ((strNum.charAt(j) - '0') == i) {
                    count++;
                }


            }
            System.out.println(count);

        }

    }
}
