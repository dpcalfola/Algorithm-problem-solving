package myTool.PrimeNumberAlgorithm;

import java.math.BigInteger;

public class PrimeNumberBiginteger {

    public static void main(String[] args) {

//        for (int i = 0; i < 100; i++) {
//            BigInteger p1 = BigInteger.valueOf(i);
//
//            if(p1.isProbablePrime(10)){
//                System.out.println(i);
//            }
//
//            System.out.println();
//
//        }


        BigInteger p2 = new BigInteger(String.valueOf(6));

        System.out.println(p2.nextProbablePrime());
//
//        if(p2.nextProbablePrime().isProbablePrime(10)){
//            System.out.println(p2.nextProbablePrime());
//        }




    }
}
