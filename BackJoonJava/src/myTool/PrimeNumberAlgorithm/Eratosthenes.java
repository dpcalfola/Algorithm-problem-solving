package myTool.PrimeNumberAlgorithm;

public class Eratosthenes extends PrimeNumber {

    public Eratosthenes() {
    }

//    int limit = (int) Math.sqrt((double) maxRangeNum);   // 인스턴스 생성 이후 값을 넣고 싶은데 디버깅시 maxRangeNum의 초기값으로 limit 값이 들어감.


    // ============ Eratosthenes Filter ============ //
    int[] eratosthenesArr() {

        // 리미트: 최대값의 루트값
        // 외부에서 가져오고 싶은 부분
        int limit = (int) Math.sqrt((double) maxRangeNum);

        // 배열 선언 및 배열의 인덱스 == 배열의 요소로
        int arr[] = new int[maxRangeNum + 1];
        for (int i = 0; i <= maxRangeNum; i++) {
            arr[i] = i;
        }

        // 0 과 1은 미리 소수x 로 초기화
        arr[0] = -1;
        arr[1] = -1;

        // 체 실행
        for (int i = 2; i <= limit; i++) {
            if (arr[i] != -1) {
                for (int j = i * i; j <= maxRangeNum; j = j + i) {
                    arr[j] = -1;
                }
            }
        }
        //
        return arr;
    }
    // ============ Eratosthenes Filter ============ //

    void print(int intVariable) {
        System.out.println(intVariable);
    }
}
