package backJoonQ2022year.q1991;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1991_yet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfNodes = Integer.parseInt(br.readLine());
        Tree t = new Tree();

        for (int i = 0; i < numberOfNodes; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            t.makeNode(st.nextToken().charAt(0), st.nextToken().charAt(0), st.nextToken().charAt(0));
        }
        System.out.println();
        System.out.println();

        t.preOrder(t.root);
    }
}

class Node {
    char data;
    Node left, right;

    Node(char data) {
        this.data = data;
    }
}

class Tree {

    // 초기값 null
    Node root;

    void makeNode(char data, char left, char right) {
        System.out.println("\n\n😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀");
        System.out.printf("MAKE NODE : %c %c %c\n", data, left, right);
        System.out.println("😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀");

        // 노드에 데이터가 없다면 (비어있는 노드인 경우)
        if (root == null) {

            // 비어있는 root 에 데이터를 채우고
            if (data != '.') {
                root = new Node(data);
                System.out.println("\nroot = " + data);
            }

            // left 가 "."이 아닌 경우: root.left 에 data 값으로 노드 생성 (생성자)
            if (left != '.') {
                root.left = new Node(left);
                System.out.println("root.left = " + root.left.data);
            }
            if (right != '.') {
                root.right = new Node(right);
                System.out.println("root.right = " + root.right.data);
            }

            // left, right 가 "." 라면 void 종료

            // 노드에 데이터가 존재한다 ==> searchNode() 실행
        } else {
            System.out.println("\n< Search method >");
            System.out.printf("root.data : %c \ndata      : %c\nleft      : %c\nright     : %c\n\n", root.data, data, left, right);
            System.out.println("----------------------");
            searchNode(root, data, left, right);
        }
    }

    private void searchNode(Node root, char data, char left, char right) {
        // 잎사귀에 닿았다?
        if (root == null) {
            System.out.println("Leaf!!! ❤️❤️❤️" + data + " " + left + " " + right + " ❤️❤️❤️");
            return;

            // Node.root.data == data 일 경우 (위치를 잡았음)
        } else if (root.data == data) {

            // 왼쪽에 집어넣을 데이터가 있다.
            if (left != '.') {
                root.left = new Node(left);
                System.out.println("\nsearch: make left node : " + left);
            }// else - 왼쪽: null


            if (right != '.') {
                root.right = new Node(right);
                System.out.println("\nsearch: make right node : " + right);
            }// else - 오른쪽: null



        } else {
            System.out.println("\n====< Recursive search method >====");
            System.out.printf("R - root.data : %c \nR - data      : %c\nR - left      : %c\nR - right     : %c\n\n", root.data, data, left, right);
            System.out.println("----------------------");
            searchNode(root.left, data, left, right);
            searchNode(root.right, data, left, right);
        }
    }

    void preOrder(Node root) {
        System.out.print("\n🌈🌈 " + root.data + " 🌈🌈\n\n");
        if (root.left != null) {
            System.out.println("Recursive call - root.left : " + root.left.data);
            preOrder(root.left);
        } else {
            System.out.println("root.left  IS NULL");
        }
        if (root.right != null) {
            System.out.println("Recursive call - root.right : " + root.right.data);
            preOrder(root.right);
        } else {
            System.out.println("root.right IS NULL");
        }
    }
}


