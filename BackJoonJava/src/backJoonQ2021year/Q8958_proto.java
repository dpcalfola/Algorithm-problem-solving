package backJoonQ2021year;

public class Q8958_proto {

    public static void main(String[] args) {

        int arr[] = new int[10];
        int ctnum = 0;
        int score = 0;


        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor(Math.random() * 2);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("--------------");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                ctnum += 1;
                score += ctnum;

            }else {
                ctnum = 0;
            }
        }

        System.out.println(score);

    }
}
