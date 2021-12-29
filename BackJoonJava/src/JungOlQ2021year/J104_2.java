package JungOlQ2021year;

public class J104_2 {
    public static void main(String[] args) {

        int kor = 91 ;
        int mat = 82 ;
        int eng = 72 ;
        int sum = kor + mat + eng ;
        int avg = sum / 3 ;  // 소수점 버림
        double douAvg = sum / 3 ; // 역시 소수점 버림
        double douAvg2 = (double) sum/ 3 ; // 소수점 안버림 ( 정수값을 실수값으로 변환 )
        double douAvg3 = sum / 3.0 ; // 소수점 안버림 ( 나눌 때 실수로 나누면 실수값 리턴 )

        System.out.println("kor " + kor);
        System.out.println("mat " + mat);
        System.out.println("eng " + eng);
        System.out.println("sum " + sum);
        System.out.println("avg " + avg);
        System.out.println();
        System.out.println(douAvg);
        System.out.println(douAvg2);
        System.out.println(douAvg3);


    }
}
