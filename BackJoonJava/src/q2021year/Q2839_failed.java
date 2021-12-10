//package q2021year;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Q2839_failed {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine());
//        br.close();
//

//
//        GreedyAlgorithm g1 = new GreedyAlgorithm();
//        g1.targetNumber = N;
//        g1.unitArr = new int[]{5, 3};
//        int[] count = g1.runGreedy();
//        int total = 0 ;
//
//        if(g1.checkReminder == -1){
//            System.out.println(-1);
//        }else{
//            for (int i = 0; i <count.length ; i++) {
//                total += count[i];
//            }
//            System.out.println(total);
//        }
//
//
//    }
//}


//
//class GreedyAlgorithm {
//
//    int[] unitArr; // 반드시 내림차순
//    int targetNumber;
//    int checkReminder; // 나누어 떨어지는지 확인용
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
//
//        if ( targetNumber != 0){  // 만약 나누어 떨어지지 않는다면 checkReminder 에 -1 리턴
//            checkReminder = -1 ;
//        }
//        return count;
//    }
//}
