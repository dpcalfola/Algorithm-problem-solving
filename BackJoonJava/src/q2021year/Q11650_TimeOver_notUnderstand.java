package q2021year;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Q11650_TimeOver_notUnderstand {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int N = scan.nextInt();


        Integer[][] arr2 = new Integer[N][2];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {

                arr2[i][j] = scan.nextInt();

            }

        }

        Arrays.sort(arr2, ((o1, o2) -> {
            if (Objects.equals(o2[0], o1[0])) {
                return Integer.compare(o1[1], o2[1]);
            } else {
                return Integer.compare(o1[0], o2[0]);
            }
        }));

        /// ????? 람다식? 2차원 정렬 코드 카피함;;


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr2[i][j] + " ");

            }
            System.out.println();
        }
    }
}
