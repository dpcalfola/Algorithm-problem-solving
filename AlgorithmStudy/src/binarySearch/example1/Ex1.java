package binarySearch.example1;

public class Ex1 {
    public static void main(String[] args) {

        // length == 9
        int[] oddSortedArr = {5, 10, 15, 40, 99, 111, 11110, 456000, 12315151};

        // length == 10

        int[] evenSortedArr = {5, 10, 15, 40, 99, 111, 700, 11110, 456000, 12315151};


        int resultIndex = binarySearchRecursiveInt(oddSortedArr, 111, 0, oddSortedArr.length - 1);
        System.out.println(resultIndex);


    }

    static int binarySearchRecursiveInt(int[] arr, int targetInt, int low, int high) {

        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == targetInt) {
            return mid;
        } else if (targetInt < arr[mid]) {
            return binarySearchRecursiveInt(arr, targetInt, low, mid - 1);
        } else {
            return binarySearchRecursiveInt(arr, targetInt, mid + 1, high);
        }


    }


}
//
//
//class BinarySearch {
//
//    int binarySearchRecursiveInt(int[] arr, int targetInt, int low, int high) {
//        if (low > high) {
//            return -1;
//        }
//
//        int mid = (low + high) / 2;
//        System.out.println("mid: " + mid);
//
//        if (targetInt < arr[mid]) {
//            binarySearchRecursiveInt(arr, targetInt, low, mid - 1);
//        } else if (targetInt > arr[mid]) {
//            binarySearchRecursiveInt(arr, targetInt, mid + 1, high);
//        } else {
//            return mid;
//        }
//    }
//
//}

/*

절반 위치의 인덱스와 비교한다

int low, mid, high


*/
