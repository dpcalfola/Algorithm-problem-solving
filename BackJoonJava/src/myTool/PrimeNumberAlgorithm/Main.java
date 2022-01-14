package myTool.PrimeNumberAlgorithm;

public class Main {
    public static void main(String[] args) {

        Eratosthenes e1 = new Eratosthenes();
        e1.minRangeNum = 1;
        e1.maxRangeNum = 100;

        //상속 잘 되었는지 테스트
        System.out.println("❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊");
        System.out.println(e1.isPrime(1003));
        System.out.println("❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊❊");


        // 체로 거른 소수배열을 가져옴
        boolean[] primeNumArr = e1.eratosthenesArr();

        // 소수만 출력
        for (int i = e1.minRangeNum; i < primeNumArr.length; i++) {
            if (!primeNumArr[i]) {
                System.out.printf("%d ",i);
            }
        }

    }

//    private static void printArr()
}
