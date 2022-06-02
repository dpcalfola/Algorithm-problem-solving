package backJoonQ2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q3040_failed2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            arrList.add(Integer.parseInt(br.readLine()));

        }

        System.out.println(arrList);


        ArrayList<Integer> tempList = new ArrayList<>();







        System.out.println(arrList);

        int sum = 0 ;

        while (sum != 100 ){
            sum = 0 ;

            tempList = arrList ;


            tempList.remove((int) Math.floor(Math.random()) * 9);
            tempList.remove((int) Math.floor(Math.random()) * 9);

            for (int i = 0; i < arrList.size(); i++) {
                sum += arrList.get(i);

            }

        }



        System.out.println(sum);

    }

}
