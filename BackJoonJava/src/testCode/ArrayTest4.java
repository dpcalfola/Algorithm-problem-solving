package testCode;

public class ArrayTest4 {

    public static void main(String[] args) {
        int arr[] = new int[10];

        int evenCounter = 0 ;
        int oddCounter = 0 ;
        int zeroCounter = 0 ;
        int evenSum = 0 ;
        int oddSum = 0 ;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor(Math.random() * 3);
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("=================");


        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                System.out.println(i + "번째 숫자" + arr[i] +" 는 0입니다");
                zeroCounter += 1;
            }
            if(arr[i]%2==0){
                System.out.println(i + "번쨰 숫자는 짝수 입니다");
                evenCounter += 1;
                evenSum += arr[i];
            }else{
                System.out.println(i + "번쨰 숫자는 홀수 입니다");
                oddCounter += 1;
                oddSum += arr[i];
            }
        }

        System.out.println("=================");

        System.out.println("evenCounter : " + evenCounter);
        System.out.println("oddCounter : " + oddCounter);
        System.out.println("zeroCounter : " + zeroCounter);
        System.out.println();
        System.out.println("evenSum : " + evenSum);
        System.out.println("oddSum : " + oddSum);


    }
}
