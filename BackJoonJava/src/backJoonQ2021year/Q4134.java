package backJoonQ2021year;

/*
//failed
public class Q4134 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseNum = Integer.parseInt(br.readLine());

        for (int i = 0; i < caseNum; i++) {

            doItAndRockAndRoll(Long.parseLong(br.readLine()));

        }


    }

    private static void doItAndRockAndRoll(long number) {

        PrimeNumber p1 = new PrimeNumber();

        while (true) {
            if (p1.isPrime(number)) {
                System.out.println(number);
                break;
            } else {
                number++;
            }
        }

//        System.out.println(p1.isPrime(number));


    }
}
/*
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
    public boolean isPrime(long n) {

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

 */