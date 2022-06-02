package backJoonQ2021year;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q6219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        br.close();


        PrimeNumber p1 = new PrimeNumber();

        String castStr = "";
        int cnt = 0;


        p1.minRangeNum = A;
        p1.maxRangeNum = B;

        p1.findPrimeNumber();

        // check code
//        System.out.println(p1.PrimeNumberArr);
        //

        for (int i = 0; i < p1.PrimeNumberArr.size(); i++) {

            castStr = String.valueOf(p1.PrimeNumberArr.get(i));

            if (castStr.contains(String.valueOf(D))) {
                cnt++;
            }

        }

        System.out.println(cnt);


    }
}


class PrimeNumber {

    ArrayList<Integer> PrimeNumberArr = new ArrayList<>();

    // 인풋 범위
    int minRangeNum;
    int maxRangeNum;

    // 최대값 최소값
    int minPrimeNum;
    int maxPrimeNum;

    // 소수의 개수
    int primeNumaCnt;

    // 존재하지 않을 경우 -1 리턴
    int nullChecker = 0;

    // 소수의 합
    int sumPrimeNum;


    public ArrayList<Integer> findPrimeNumber() {

        primeNumaCnt = 0;


        for (int num = minRangeNum; num <= maxRangeNum; num++) {

            if (isPrime(num)) {
                PrimeNumberArr.add(num);
                primeNumaCnt++;
            }

        }

        if (primeNumaCnt != 0) {

            minPrimeNum = PrimeNumberArr.get(0);
            maxPrimeNum = PrimeNumberArr.get(PrimeNumberArr.size() - 1);

            for (int i = 0; i < PrimeNumberArr.size(); i++) {
                sumPrimeNum += PrimeNumberArr.get(i);

            }

        } else {
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

        for (int i = 2; i*i <= n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
