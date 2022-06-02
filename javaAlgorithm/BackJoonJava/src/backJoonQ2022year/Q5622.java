package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char[] chaArr = str.toCharArray();
        int[] intArr = new int[str.length()];

        for (int i = 0; i < chaArr.length; i++) {
            intArr[i] = chaArr[i] - 65;
        }

        int time = 0;
        for (int j : intArr) {
            if (j < 15) {
                time += j / 3 + 3;
            } else if (j < 19){
                time += 8;
            } else if (j < 22) {
                time += 9;
            } else {
                time += 10;
            }
        }
        System.out.println(time);
    }
}


// /3 == 0
// A == 0
// B == 1
// C == 2

// /3 == 1
// D, E, F == 3, 4, 5

// /3 == 2
// GHI == 6,7,8

// JKL /3 = 3  ( 9 10 11

// MNO /3 = 4 ( 12 13 14

// PQRS ( 15 16 17 18
//

// TUV => %3 ==> 6 ( 19 20 21

// /3 = 7 or 8
// W == 22
// X == 23
// Y == 24
// Z == 25