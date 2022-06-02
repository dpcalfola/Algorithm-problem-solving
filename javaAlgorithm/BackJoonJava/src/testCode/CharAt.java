package testCode;

public class CharAt {

    public static void main(String[] args) {
        int a = 1234566;
        String strA = Integer.toString(a);

        System.out.println(strA);

        System.out.println(strA.length());

        System.out.println("---------------");


//        System.out.println(strA.charAt(5));

        int countNum6 = 0;

        for (int i = 0; i < strA.length(); i++) {
            System.out.println(strA.charAt(i));
        }

        System.out.println("---------------");

        for (int i = 0; i < strA.length(); i++) {
            if ((strA.charAt(i) - '0') == 6) {
                countNum6++;
            }

        }
        System.out.println(countNum6);

        System.out.println("-----------------");





    }
}
