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

    // μ΄κΈ°κ° null
    Node root;

    void makeNode(char data, char left, char right) {
        System.out.println("\n\nπππππππππππππππππππππππ");
        System.out.printf("MAKE NODE : %c %c %c\n", data, left, right);
        System.out.println("πππππππππππππππππππππππ");

        // λΈλμ λ°μ΄ν°κ° μλ€λ©΄ (λΉμ΄μλ λΈλμΈ κ²½μ°)
        if (root == null) {

            // λΉμ΄μλ root μ λ°μ΄ν°λ₯Ό μ±μ°κ³ 
            if (data != '.') {
                root = new Node(data);
                System.out.println("\nroot = " + data);
            }

            // left κ° "."μ΄ μλ κ²½μ°: root.left μ data κ°μΌλ‘ λΈλ μμ± (μμ±μ)
            if (left != '.') {
                root.left = new Node(left);
                System.out.println("root.left = " + root.left.data);
            }
            if (right != '.') {
                root.right = new Node(right);
                System.out.println("root.right = " + root.right.data);
            }

            // left, right κ° "." λΌλ©΄ void μ’λ£

            // λΈλμ λ°μ΄ν°κ° μ‘΄μ¬νλ€ ==> searchNode() μ€ν
        } else {
            System.out.println("\n< Search method >");
            System.out.printf("root.data : %c \ndata      : %c\nleft      : %c\nright     : %c\n\n", root.data, data, left, right);
            System.out.println("----------------------");
            searchNode(root, data, left, right);
        }
    }

    private void searchNode(Node root, char data, char left, char right) {
        // μμ¬κ·μ λΏμλ€?
        if (root == null) {
            System.out.println("Leaf!!! β€οΈβ€οΈβ€οΈ" + data + " " + left + " " + right + " β€οΈβ€οΈβ€οΈ");
            return;

            // Node.root.data == data μΌ κ²½μ° (μμΉλ₯Ό μ‘μμ)
        } else if (root.data == data) {

            // μΌμͺ½μ μ§μ΄λ£μ λ°μ΄ν°κ° μλ€.
            if (left != '.') {
                root.left = new Node(left);
                System.out.println("\nsearch: make left node : " + left);
            }// else - μΌμͺ½: null


            if (right != '.') {
                root.right = new Node(right);
                System.out.println("\nsearch: make right node : " + right);
            }// else - μ€λ₯Έμͺ½: null



        } else {
            System.out.println("\n====< Recursive search method >====");
            System.out.printf("R - root.data : %c \nR - data      : %c\nR - left      : %c\nR - right     : %c\n\n", root.data, data, left, right);
            System.out.println("----------------------");
            searchNode(root.left, data, left, right);
            searchNode(root.right, data, left, right);
        }
    }

    void preOrder(Node root) {
        System.out.print("\nππ " + root.data + " ππ\n\n");
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


