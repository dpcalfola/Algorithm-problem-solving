package myTool.PrimeNumberAlgorithm;

import java.util.ArrayList;

public class PrimeNumber {

    public PrimeNumber() {
    }

    public PrimeNumber(int maxRangeNum){
        this.maxRangeNum = maxRangeNum ;
    }

//    public PrimeNumber(int minRangeNum, int maxRangeNum){
////        this(maxPrimeNum);
//        this.minRangeNum = minRangeNum ;
//    }

    ArrayList<Integer> PrimeNumberArr = new ArrayList<>();

    // 인풋 범위
    int minRangeNum;
    int maxRangeNum;

    // 최대값 최소값
    int minPrimeNum;
    int maxPrimeNum;

    // 소수의 개수
    int primeNumCnt;

    // 존재하지 않을 경우 -1 리턴
    int nullChecker = 0;

    // 소수의 합
    int sumPrimeNum;


    // 최소범위 , 최대범위 설정 후 실행하여 소수 List 리턴
    // 소수의 개수 설정
    public ArrayList<Integer> findPrimeNumber() {
        primeNumCnt = 0;

        for (int num = minRangeNum; num <= maxRangeNum; num++) {
            if (isPrime(num)) {
                PrimeNumberArr.add(num);
                primeNumCnt++;
            }
        }
        //소수의 개수가 0개가 아닐경우 최대값 최소값 소수의 합 셋팅
        if (primeNumCnt != 0) {

            minPrimeNum = PrimeNumberArr.get(0);
            maxPrimeNum = PrimeNumberArr.get(PrimeNumberArr.size() - 1);

            for (int i = 0; i < PrimeNumberArr.size(); i++) {
                sumPrimeNum += PrimeNumberArr.get(i);
            }

        } else {
            // 소수의 개수가 0개일 경우 nullChecker = -1
            nullChecker = -1;
        }

        return PrimeNumberArr;
    }


    // 소수 판별 메서드
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
