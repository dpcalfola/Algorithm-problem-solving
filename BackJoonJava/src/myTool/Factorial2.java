package myTool;

public class Factorial2 {

    public static void main(String[] args) {

        System.out.println(factorial(20L));
    }


    public static long factorial(long num) {
        if (num == 0) {
            return 1;
        }else {
            return factorial(num - 1) * num;
        }
    }
}

