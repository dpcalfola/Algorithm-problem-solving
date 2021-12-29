package myTool.PrimeNumber;

import java.util.ArrayList;

public class PrimeNumber {

    ArrayList<Integer> PrimeNumberArr = new ArrayList<>();

    int minRangeNum;
    int maxRangeNum;

    int minPrimeNum;
    int maxPrimeNum;

    int nullChecker; // 존재하지 않을 경우 -1 리턴


    public ArrayList<Integer> findPrimeNumber() {


        if (minRangeNum <= 2) {
            PrimeNumberArr.add(2);
        }

        for (int num = minRangeNum; num <= maxRangeNum; num++) {

            for (int j = 2; j < num; j++) {

                if (num % j == 0) {
                    break;
                }
                // 이게 왜 되지..??
            }


        }

        minPrimeNum = PrimeNumberArr.get(0);
        maxPrimeNum = PrimeNumberArr.get(PrimeNumberArr.size() - 1);


        return PrimeNumberArr;
    }


}
