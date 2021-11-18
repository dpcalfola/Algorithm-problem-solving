package q2021year;

import java.math.BigInteger;
import java.util.Scanner;

public class Q10757 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();
        BigInteger c = a.add(b);

        System.out.println(c);

    }
}
