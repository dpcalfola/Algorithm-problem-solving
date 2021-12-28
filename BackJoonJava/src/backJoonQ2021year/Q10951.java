package backJoonQ2021year;

import java.util.Scanner;

public class Q10951 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        while(scan.hasNextInt()) {  // 인풋값이 int 가 아닐시 while 문을 빠져나간다.
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a+b);
        }

        scan.close();

    }
}
