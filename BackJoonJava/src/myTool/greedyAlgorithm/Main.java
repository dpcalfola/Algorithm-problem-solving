package myTool.greedyAlgorithm;

public class Main {
    public static void main(String[] args) {
        GreedyAlgorithm g1 = new GreedyAlgorithm();

        g1.targetNumber = 29 ;
        g1.unitArr = new int[]{10,5,1};

        System.out.println(g1.targetNumber);

        int[] answerArr = g1.runGreedy();

        for(int j : answerArr){
            System.out.println(j);
        }

        System.out.println(g1.checkReminder);


    }
}
