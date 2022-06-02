package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q13900 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arrSize = Integer.parseInt(br.readLine());
        int[] arr = new int[arrSize];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 0*1 + 0*2 + 0*3 + 0*4 = 0*(1+2+3+4)
        // 1*2 + 1*3 + 1*4       = 1*(2+3+4)
        // 2*3 + 2*4             = 2*(3+4)
        // 3*4                   = 3*(4)

        // 4*3 + 4*2 + 4*1 + 4*0 = 4*(3+2+1+0)
        // 3*2 + 3*1 + 3*0       = 3*(2+1+0)
        // 2*1 + 2*0             = 2*(1+0)
        // 1*0                   = 1*(0)


        // 두번째 인덱스부터 마지막 인덱스까지의 합을 구한다
        // 어차피 반복문을 두번 돌긴 해야함

        // for 문 하나로 답을 더해야함 (잘 안됨...)


        // 뒤집는다
        // 3*4                   = (4) *3
        // 2*3 + 2*4             = (3+(4)) *2
        // 1*2 + 1*3 + 1*4       = (2+(3+4)) *1
        // 0*1 + 0*2 + 0*3 + 0*4 = (1+(2+3+4)) *0


        long bigSum = 0L;
        long smallSum = 0L;

        for (int i = arr.length-2; i >= 0; i--) {
            smallSum += arr[i+1];
            bigSum += smallSum*arr[i];

        }

        System.out.println(bigSum);
    }
}


// 배열에서 두 수를 뽑는 모든 경우의수
// 하나의 수를 뽑고
// 다음 인덱스에서 마지막 인덱스까지 돈다
// 두 번쨰 수를 뽑고
// 다음 인덱스에서 마지막 인덱스까지 돈다
// (TimeOver)