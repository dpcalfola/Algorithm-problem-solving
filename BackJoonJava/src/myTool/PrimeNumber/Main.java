package myTool.PrimeNumber;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        PrimeNumber p1 = new PrimeNumber();

        p1.minRangeNum = 102;
        p1.maxRangeNum = 198;

        ArrayList<Integer> resultList = p1.findPrimeNumber();

        System.out.println(resultList);

        System.out.println(p1.minPrimeNum);
        System.out.println(p1.maxPrimeNum);


    }
}
