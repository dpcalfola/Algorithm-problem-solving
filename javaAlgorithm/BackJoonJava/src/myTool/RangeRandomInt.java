package myTool;

import java.util.Arrays;

public class RangeRandomInt {

    public static void main(String[] args) {

        int[] a = randInt(1, 45, 6);

        printArr(a, 6);


    }

    public static int[] randInt(int rangeMin, int rangeMax, int number) {


        int[] arr = new int[number];

        for (int i = 0; i < number; i++) {

            arr[i] = (int) Math.floor(Math.random() * (rangeMax - rangeMin + 1)) + rangeMin;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }

                /*
                 * 만약 arr[3] = 6 일경우
                 * j for 문에서
                 *
                 * arr[3] == arr[0]
                 *        == arr[1]
                 *        == arr[2]
                 *
                 * 중에 같은 숫자가 있을 경우
                 * i 를 하나 줄여
                 * arr[3] 을 다시 뽑는다.
                 *
                 * 따라서 j for 문의 범위는 ( j < i )
                 *
                 * */
            }


        }

        Arrays.sort(arr); // 작은 수에서 큰 수로 정렬


        return arr;
    }

    public static void printArr(int[] arr) {

        for (int j : arr) {
            System.out.println(j);

        }

    }

    public static void printArr(int[] arr, int column) {

        int b = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4s" , arr[i] + " ");

            b++;
            if (b % (column) == 0) {
                System.out.println();
            }

        }

    }


}
