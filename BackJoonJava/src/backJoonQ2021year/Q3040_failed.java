package backJoonQ2021year;

import myTool.PrintAllArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3040_failed {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//        }
        //인풋 완료

        int[] arr1 = {7, 8, 10, 13, 15, 19, 20, 23, 25}; // 가짜 15,25 인덱스 4, 8
        // 임시 인풋값


        int sum = 0;


        //  돌린다!! 될때까지


        int[] manipulArr = arr1;

        // 0-9 사이의 랜덤 숫자 두개 셍성
        int[] removeIndex = new int[2];

        removeIndex[0] = (int) Math.floor(Math.random() * 9);
        removeIndex[1] = (int) Math.floor(Math.random() * 9);

        while (removeIndex[0] == removeIndex[1]) {
            removeIndex[1] = (int) Math.floor(Math.random() * 9);
        }


        int a = removeIndex[0];
        int b = removeIndex[1];

        System.out.println(a);
        System.out.println(b);

        manipulArr[a] = 0;
        manipulArr[b] = 0;

        PrintAllArray.printAllInt(manipulArr);


        // 조작된 배열의 합
        for (int i = 0; i < manipulArr.length; i++) {
            sum += manipulArr[i];
        }

        System.out.println(sum);




    }


}
