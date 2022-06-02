//package q2021year;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Q5585 {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int a = Integer.parseInt(br.readLine());
//
//        GreedyAlgorithm g1 = new GreedyAlgorithm();
//
//        g1.targetNumber = 1000 - a;
//        g1.unitArr = new int[]{500, 100, 50, 10, 5, 1};
//
//        int[] result = g1.runGreedy();
//        int total = 0;
//
//        for (int i = 0; i < result.length; i++) {
//            total += result[i];
////            System.out.println(result[i]);
//        }
//
//        System.out.println(total);
//
//
//    }
//}

//
//
//class GreedyAlgorithm {
//
//    int[] unitArr;
//    int targetNumber;
//
//
//    public int[] runGreedy() {
//
//
//        int[] count = new int[unitArr.length];
//
//        for (int i = 0; i < unitArr.length; i++) {
//
//            while (targetNumber >= unitArr[i]) {
//                targetNumber -= unitArr[i];
//                count[i]++;
//            }
//
//        }
//        return count;
//    }
//}