package backJoonQ2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3040 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // input
        int[] InputArr = new int[9];
        for (int i = 0; i < InputArr.length; i++) {
            InputArr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        //

        int sum = 0;
        int[] arr = new int[9];


        // ================ repeat infinitely !! ===================== //
        while (true) {
            // Start Manipulating !!

            // Copy Array
            for (int i = 0; i < arr.length; i++) {
                arr[i] = InputArr[i];
            }
            //


            // choice two number for removing
            int rmNum1 = (int) Math.floor(Math.random() * 9);
            int rmNum2 = (int) Math.floor(Math.random() * 9);

            if (rmNum1 == rmNum2) {
                rmNum2 = (int) Math.floor(Math.random() * 9);
            }
            //

            // make 0 two element in array
            arr[rmNum1] = 0;
            arr[rmNum2] = 0;
            //

            // sum of array


            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            //
//            PrintAllArray.printAllInt(arr);

            // End Manipulating


            // Escape loop
            if (sum == 100) {
                break;
            } else {
                sum = 0;
            }
            //
        }
        // ================ repeat infinitely !! ===================== //

//        System.out.println("Finally ==================");
//        System.out.println(sum);
//        PrintAllArray.printAllInt(arr);

        // Popup zero value space
        int[] ansArr = new int[7];
        int ansCounter = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                ansArr[ansCounter] = arr[i];
                ansCounter++;
            }

        }
        //


        //PrintAllArray.printAllInt(ansArr);


        // THIS WHAT I CAN DO ❤︎❤︎❤︎❤︎
        for (int i = 0; i < ansArr.length; i++) {
            System.out.println(ansArr[i]);
        }
        //


    }
}
