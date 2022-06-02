package binarySearch.example2;

import javax.naming.BinaryRefAddr;

public class ex2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int resultInt = binarySearch(arr, 3, 0, arr.length - 1);
        System.out.println(resultInt);

    }

    static int binarySearch(int[] arr, int target, int low, int high) {

        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (target < arr[mid]) {
            return binarySearch(arr, target, low, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, high);
        }
    }


}
