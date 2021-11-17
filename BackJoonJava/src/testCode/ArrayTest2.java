package testCode;

import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요 : ");

        int arrSize = scan.nextInt();

        int[] arr = new int[arrSize];

        for ( int i = 0 ; i < arr.length ; i++ ){
            System.out.print(i + "번째 숫자를 넣어주세요 : ");
            arr[i] = scan.nextInt();

        }

        for ( int i = 0 ; i < arr.length ; i++ ) {
            System.out.println(arr[i]);
        }


        scan.close();








    }
}
