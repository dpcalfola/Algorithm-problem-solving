package q2021year;

import java.util.Scanner;

public class Q5692 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String n = scan.next();
            if (n.equals("0")) {
                break;
            }

            int sum = 0;
            int reAt = n.length();

            for (int i = 0; i < n.length(); i++) {

                sum += (n.charAt(i) - '0') * factorial(reAt--);

            }

            System.out.println(sum);

        }


    }

    public static long factorial(long num) {
        if (num == 0) {
            return 1;
        } else {
            return factorial(num - 1) * num;
        }
    }
}
