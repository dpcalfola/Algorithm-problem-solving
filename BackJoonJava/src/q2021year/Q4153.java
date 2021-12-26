package q2021year;

import java.util.Arrays;
import java.util.Scanner;

public class Q4153 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[3];

        while (true) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            arr[0] = a;
            arr[1] = b;
            arr[2] = c;

            Arrays.sort(arr);

            if (arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

//            PrintAllArray.printAllInt(arr);


        }

    }

}