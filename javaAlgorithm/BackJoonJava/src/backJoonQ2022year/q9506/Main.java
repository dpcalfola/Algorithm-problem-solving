package backJoonQ2022year.q9506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int number = Integer.parseInt(br.readLine());
            if (number == -1){
                break;
            }

            ArrayList<Integer> list = new ArrayList();

            // 약수를 구함
            for (int i = 1; i < number; i++) {
                if(number%i == 0){
                    list.add(i);
                }
            }

            int sum = 0;
            for(Integer i : list ){
                sum += i;
            }

            StringBuilder sb = new StringBuilder();
            if (sum == number){
                sb.append(number).append(" = ");
                for (int i = 0; i < list.size()-1; i++) {
                    sb.append(list.get(i)).append(" + ");
                }
                sb.append(list.get(list.size()-1));
                System.out.println(sb);
            }else{
                System.out.println(number + " is NOT perfect.");
            }
        }
    }
}
