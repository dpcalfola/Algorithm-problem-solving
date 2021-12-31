package myTool.PrimeNumberAlgorithm;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        PrimeNumber p1 = new PrimeNumber();

        p1.minRangeNum = 60;
        p1.maxRangeNum = 100;

        ArrayList<Integer> resultList = p1.findPrimeNumber();

        System.out.println("PrimeNumber List : " + resultList);

        System.out.println("minPrimeNum : " + p1.minPrimeNum);
        System.out.println("maxPrimeNum : " + p1.maxPrimeNum);
        System.out.println("primeNumaCnt : " + p1.primeNumaCnt);
        System.out.println("nullChecker : " + p1.nullChecker);
        System.out.println("sumPrimeNum : " + p1.sumPrimeNum);


    }
}
