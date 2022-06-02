package backJoonQ2021year;

import myTool.PrintAllArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11047 {

    public static void main(String[] args) throws IOException {

        // Input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int numOfCoin = Integer.parseInt(st.nextToken());
        int targetNumber = Integer.parseInt(st.nextToken());


        int[] unitArr = new int[numOfCoin];

        for (int i = 0; i < unitArr.length; i++) {
            unitArr[i] = Integer.parseInt(br.readLine());
        }

        //

        // Input check
        System.out.println(numOfCoin);
        System.out.println(targetNumber);
        PrintAllArray.printAllInt(unitArr);
        //

        // Should be descending order
        // Revers array

        int[] revUnitArr = new int[numOfCoin];

        for (int i = 0; i < unitArr.length; i++) {
            revUnitArr[i] = unitArr[unitArr.length - 1 - i];
        }
        //

        PrintAllArray.printAllInt(revUnitArr);


        // Make instance and input data to class
        GreedyAlgorithm g = new GreedyAlgorithm();
        g.unitArr = revUnitArr;
        g.targetNumber = targetNumber;
        //

        // Execute greedy algorithm
        int[] resultArr = g.runGreedy();
        //

        // Sum of result array
        int sum = 0;
        for (int i = 0; i < resultArr.length; i++) {
            sum += resultArr[i];
        }
        //

        // print answer
        System.out.println(sum);





        // Test Code

        System.out.println("=============================");
        PrintAllArray.printAllInt(resultArr);
        PrintAllArray.printAllInt(g.unitArr);
        System.out.println(targetNumber);


    }
}


class GreedyAlgorithm {

    int[] unitArr; // 반드시 내림차순 정리 !!
    int targetNumber;
    int checkReminder; // 나누어 떨어지는지 확인용


    public int[] runGreedy() {


        int[] count = new int[unitArr.length];

        for (int i = 0; i < unitArr.length; i++) {

            while (targetNumber >= unitArr[i]) {
                targetNumber -= unitArr[i];
                count[i]++;
            }

        }

        if (targetNumber != 0) {  // 만약 나누어 떨어지지 않는다면 checkReminder 에 -1 리턴
            checkReminder = -1;
        }
        return count;
    }
}