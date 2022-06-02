package backJoonQ2021year;

import java.math.BigInteger;
import java.util.Scanner;

public class Q14928_timeOver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger a = scan.nextBigInteger();
        scan.close();
        BigInteger b = new BigInteger("20000303");


        System.out.println(a.remainder(b));

    }
}
