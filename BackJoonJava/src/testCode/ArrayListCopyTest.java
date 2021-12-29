package testCode;

import java.util.ArrayList;

public class ArrayListCopyTest {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add((int) Math.floor(Math.random() * 10));
        }

        System.out.println("1 : " + arrayList);

        ArrayList<Integer> arrayList2 = new ArrayList<>();


        arrayList2 = arrayList;

        System.out.println("2 : " + arrayList);
        System.out.println("3 : " + arrayList2);

        arrayList2.remove(4);
        arrayList2.remove(1);

        System.out.println("4 : " + arrayList);
        System.out.println("5 : " + arrayList2);




    }


}
