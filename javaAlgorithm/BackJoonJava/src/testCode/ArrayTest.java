package testCode;

public class ArrayTest {

    public static void main(String[] args) {

        int[] ar = new int[10];

        for (int i = 0 ; i <10 ; i++) {
            System.out.println(i + " : " + ar[i]);
        }

    }


}


// 결론 : 값을 채워 넣지 않은 array 의 값은 0 이다.