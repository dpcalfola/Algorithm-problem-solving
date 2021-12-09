package myTool;

public class GreedyAlgorithm_yet {

    public GreedyAlgorithm_yet(int[] unitArr, int targetNumber) {
        this.unitArr = unitArr;
        this.targetNumber = targetNumber;
    }

    int[] unitArr ;
    int targetNumber ;



    public static int[] greedAlgo(int[] unitArr, int targetNumber) {

//        int[] unit = new int[]{25, 10, 5, 1};

        int[] count = new int[unitArr.length];

        for (int i = 0; i < unitArr.length; i++) {

            while (targetNumber >= unitArr[i]) {
                targetNumber -= unitArr[i];
                count[i]++;
            }

        }
        return count;
    }
}
