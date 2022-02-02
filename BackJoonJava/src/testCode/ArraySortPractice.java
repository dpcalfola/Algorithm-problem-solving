package testCode;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortPractice {
    public static void main(String[] args) {

        Integer[] arr = new Integer[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor(Math.random()*100);
        }

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2) * -1;
            }
        });

        Arrays.sort(arr, (o1,o2) ->{
            return Integer.compare(o1, o2);

        });

        System.out.println(Arrays.toString(arr));




        Arrays.sort(arr, (o1, o2) -> o1.compareTo(o2) * -1);



    }
}
