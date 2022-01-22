package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10828_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        myStack stk = new myStack();

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case ("push"):
                    stk.push(Integer.parseInt(st.nextToken()));
//                    System.out.println("stackLevel: " + stk.stackLevel);
                    break;
                case ("pop"):
                    stk.pop();
//                    System.out.println("stackLevel: " + stk.stackLevel);
                    break;
                case ("size"):
                    System.out.println(stk.size());
//                    System.out.println("stackLevel: " + stk.stackLevel);
                    break;
                case ("empty"):
                    System.out.println(stk.empty());
//                    System.out.println("stackLevel: " + stk.stackLevel);
                    break;
                case ("top"):
                    System.out.println(stk.orderTop());
//                    System.out.println("stackLevel: " + stk.stackLevel);
                    break;
                default:
                    break;
            }
        }
    }
}

class myStack {
    private final int[] stack;
    int stackLevel;
    int top;

    myStack() {
        stack = new int[10000];
        stackLevel = -1;
        top = -1;
    }

    void push(int n) {
        stackLevel++;
        stack[stackLevel] = n;
        top = n;
    }

    void pop() {
        if (stackLevel == -1) {
            System.out.println(-1);
        } else {
            System.out.println(top);
            // check!!
            if (stackLevel != 0) {
                top = stack[stackLevel - 1];
            }
            stackLevel--;
        }
    }

    int size() {
        return stackLevel + 1;
    }

    int empty() {
        if (stackLevel == -1) {
            return 1;
        }
        return 0;
    }

    int orderTop() {
        if (stackLevel == -1) {
            return -1;
        }
        return top;
    }

}
