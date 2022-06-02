package myTool;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShiftArray {

    public static int[] shiftRightArrayInt(int[] arr) {

        int temp = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = temp;

        return arr;

    }

    public static int[] shiftLeftArrayInt(int[] arr) {

        int temp = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = temp;

        return arr;

    }

    public static int[] shiftReverseArrayInt(int[] arr) {

        Integer[] arrI = new Integer[arr.length];


        // int[] 를 Integer[] 로 변환
        for (int i = 0; i < arr.length; i++) {
            arrI[i] = arr[i];
        }



        // 리스트로 변환 후 리버스
        List<Integer> list = Arrays.asList(arrI);
        Collections.reverse(list);



        // Integer[] 를 int[] 로 변환
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrI[i];
        }


        return arr;
    }
}
