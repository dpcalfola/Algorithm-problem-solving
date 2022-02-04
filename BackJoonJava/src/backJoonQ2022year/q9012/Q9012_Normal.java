package backJoonQ2022year.q9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9012_Normal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            System.out.println(isVPS(br.readLine()));
        }
    }

    private static String isVPS(String str) {
        int point = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                point++;
            } else {
                point--;
                if (point < 0) {
                    return "NO";
                }
            }
        }
        return point == 0 ? "YES" : "NO";
    }
}

/*

( : +1
) : -1

point 에 음수가 나오면 break 걸고 NO 리턴
최종 결과가 0인 경우 YES 리턴

 */