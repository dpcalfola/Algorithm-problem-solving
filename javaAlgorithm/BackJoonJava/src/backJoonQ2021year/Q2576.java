package backJoonQ2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            numbers.add(Integer.parseInt(br.readLine()));
        }

        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            if (numbers.get(i) % 2 != 0) {
                oddNumbers.add(numbers.get(i));
            }
        }

        int sum = 0;


//        System.out.println(oddNumbers);

        for (int i = 0; i < oddNumbers.size(); i++) {
            sum += oddNumbers.get(i);
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            int min = Collections.min(oddNumbers);
            System.out.println(sum);
            System.out.println(min);
        }

    }
}
