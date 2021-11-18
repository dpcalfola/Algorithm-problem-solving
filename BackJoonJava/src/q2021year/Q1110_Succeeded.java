package q2021year;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Q1110_Succeeded {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int initialNum = scan.nextInt();
        scan.close();

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int initialNum = Integer.parseInt(br.readLine());
//        br.close();


        int count = 1;

        int[] splitNum = splitNumMethod(initialNum);

        while (splitNum[1] * 10 + splitNum[2] != initialNum) { // 조건문 체크시 이미 한 싸이클 돌았음. ( count 1부터 시작 )
            makeNewSplit(splitNum);
            count++;
        }
//        System.out.println(count);  // 출력

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();


    }

    private static void makeNewSplit(int[] array) {

        int n2 = array[1];
        int n3 = array[2];

        array[0] = n2;
        array[1] = n3;
        array[2] = (n2 + n3) % 10;
    }

    private static int[] splitNumMethod(int inputNum) {
        int n1, n2;

        if (inputNum == 0) {
            n1 = 0;
            n2 = 0;
        } else if (inputNum < 10) {
            n1 = 0;
            n2 = inputNum;
        } else {
            n1 = inputNum / 10;
            n2 = inputNum % 10;
        }


        return new int[]{n1, n2, (n1 + n2) % 10};
    }
}
