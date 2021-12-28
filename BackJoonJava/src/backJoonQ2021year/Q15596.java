package backJoonQ2021year;

public class Q15596 {
    long sum(int[] a) {
        long ans = 0L;   // long 변수의 데이터 값 뒤에는 대문자 L 을 붙인다.

        for (int i = 0; i < a.length; i++) {
            ans += a[i];
        }
        return ans;
    }
}

// 제출시 클래스명 Q15596 를 Test 로 수정할것


/*
*
* for (int j : a) {
            ans += j;
        }
*
*
* */