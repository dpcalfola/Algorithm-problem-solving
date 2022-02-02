package testCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctPractice {
    public static void main(String[] args) {
        List<String> strArr = Arrays.asList("A", "B", "A", "V", "C", "D", "D", "a");

        // 리스트의 중복 제거
        strArr = strArr.stream().distinct().collect(Collectors.toList());

        System.out.println(strArr);

    }
}
