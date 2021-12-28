package backJoonQ2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3028 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int[] arr = {1, 0, 0};  // 공 위치 초기값


        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);

            if(String.valueOf(a).equals("A")){
                moveA(arr);
            }else if(String.valueOf(a).equals("B")){
                moveB(arr);
            }else{
                moveC(arr);
            }
        }

//        PrintAllArray.printAllInt(arr);


        if(arr[0] == 1){
            System.out.println(1);
        }else if (arr[1] == 1){
            System.out.println(2);
        }else{
            System.out.println(3);
        }


    }

    private static int[] moveA(int[] arr) {

        int temp = arr[0];

        arr[0] = arr[1];
        arr[1] = temp;

        return arr;
    }

    private static int[] moveB(int[] arr) {

        int temp = arr[1];

        arr[1] = arr[2];
        arr[2] = temp;

        return arr;
    }

    private static int[] moveC(int[] arr) {

        int temp = arr[0];

        arr[0] = arr[2];
        arr[2] = temp;

        return arr;
    }

}
