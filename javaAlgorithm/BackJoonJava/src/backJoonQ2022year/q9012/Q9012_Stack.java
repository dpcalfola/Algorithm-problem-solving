package backJoonQ2022year.q9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;

public class Q9012_Stack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(br.readLine());

        for (int i = 0; i < caseNum; i++) {
            // 각 테스트의 결과를 "YES" / "NO"
            String answer = IsCorrectParenthesis(br.readLine());
            System.out.println(answer);
        }
    }



    private static String IsCorrectParenthesis(String str) {

        Stack<Boolean> stk = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            switch (str.charAt(i)) {

                // 열린 괄호 => 스택을 하나 쌓는다
                case '(':
                    stk.push(true);
                    break;

                // 닫힌 괄호 => 스택을 하나 꺼낸다
                case ')':
                    try {
                        stk.pop();
                    } catch (EmptyStackException e) {
                        // 빈 스택에서 꺼내려고 시도하면 NO 리턴
                        return "NO";
                    }
                    break;
            }
        }

        // 스택이 비어있으면 "YES"
        if (stk.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}


/*
 괄호 문제 : 괄호의 열리고 닫힘 짝이 맞는지?

 스택

 (  ==> push
 )  ==> pop

 1. 연산이 끝났을 떄 스택이 비어 있으면 YES
 2. 빈 스택에 pop 을 시도하면 break 걸고 "NO" 출력
    테스트 결과: 빈 스택에 pop을 시도하면 EmptyStackException 예외 발생
        예외 catch 해서 "NO" 리턴

*/


