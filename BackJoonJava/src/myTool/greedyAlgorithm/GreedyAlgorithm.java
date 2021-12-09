package myTool.greedyAlgorithm;

class GreedyAlgorithm {

    int[] unitArr;
    int targetNumber;

    public GreedyAlgorithm() {

    }


    public int[] runGreedy() {


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