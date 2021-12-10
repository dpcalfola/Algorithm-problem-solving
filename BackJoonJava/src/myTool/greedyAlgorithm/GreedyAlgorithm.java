package myTool.greedyAlgorithm;

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

        if ( targetNumber != 0){  // 만약 나누어 떨어지지 않는다면 checkReminder 에 -1 리턴
            checkReminder = -1 ;
        }
        return count;
    }
}