package backJoonQ2021year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1312_failed {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        args = br.readLine().split(" ");

        double A = Double.parseDouble(args[0]);
        double B = Double.parseDouble(args[1]);
        int D = Integer.parseInt(args[2]);

        double AsB = A/B ;
        double i = Math.floor(AsB);

        double p = AsB - i ;

        System.out.println(p);

        int num = (int) (p * Math.pow(10, D));

        System.out.println(num);

        System.out.println(num % 10);


    }
}
