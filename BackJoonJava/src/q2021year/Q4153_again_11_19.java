package q2021year;

import java.util.Arrays;
import java.util.Scanner;

public class Q4153_again_11_19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arrInt = {-1, -1, -1};

        while (arrInt[0] != 0 && arrInt[1] != 0 && arrInt[2] != 0) {
            for (int i = 0; i < arrInt.length; i++) {
                arrInt[i] = scan.nextInt();
            }

            Arrays.sort(arrInt);


            if (arrInt[0] == 0 && arrInt[1] == 0 && arrInt[2] == 0) {
                break;
            }

//            for (int i = 0; i < arrInt.length; i++) {
//                System.out.println(arrInt[i]);
//            }


            if (arrInt[2] * arrInt[2] == arrInt[1] * arrInt[1] + arrInt[0] * arrInt[0]) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }


    }
}
