package backJoonQ2021year;

import java.util.Scanner;

public class Q2754 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        scan.close();

        switch (s){
            case "A+" :
                System.out.println(4.3);
                break;
            case "A0" :
                System.out.println(4.0);
                break;
            case "A-" :
                System.out.println(3.7);
                break;
            case "B+" :
                System.out.println(3.3);
                break;
            case "B0" :
                System.out.println(3.0);
                break;
            case "B-" :
                System.out.println(2.7);
                break;
            case "C+" :
                System.out.println(2.3);
                break;
            case "C0" :
                System.out.println(2.0);
                break;
            case "C-" :
                System.out.println(1.7);
                break;
            case "D+" :
                System.out.println(1.3);
                break;
            case "D0" :
                System.out.println(1.0);
                break;
            case "D-" :
                System.out.println(0.7);
                break;
            default:
                System.out.println(0.0);


        }

    }
}
