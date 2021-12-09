package myTool.greedyAlgorithm;

public class Main {
    public static void main(String[] args) {
        GreedyAlgorithm g1 = new GreedyAlgorithm();

        g1.targetNumber = 124 ;
        g1.unitArr = new int[]{25, 10, 1, 5};

        int[] answerArr = g1.runGreedy();

        for(int j : answerArr){
            System.out.print(j);
        }


    }
}
