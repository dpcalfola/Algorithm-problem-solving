package testCode;

public class TestPrimeNumber {
    public static void main(String[] args) {

        System.out.println(2);


        for (int i = 0; i < 100; i++) {

            for (int j = 2; j < i; j++) {

                if(i%j == 0){
                    break;
                }else{
                    System.out.println(i);
                    break;
                }


            }


        }
    }
}


//
//if (num % j != 0) {
//        PrimeNumberArr.add(num);
//        }
//        break ;