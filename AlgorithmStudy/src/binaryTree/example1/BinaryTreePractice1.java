package binaryTree.example1;

class Node {
    int data;
    Node left;
    Node right;
}

class Tree {
    private Node root;

    public Node makeNode(Node left, int data, Node right) {
        Node node = new Node();
        node.data = data;
        node.left = left;
        node.right = right;
        return node;
    }

    public void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    public void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}

/*

        (1)
        / \
      (2) (3)
      / \
    (4)  (5)


Inorder (Left, Root, Right) : 4, 2, 5, 1, 3
Preorder (Root, Left, Right) : 1, 2, 4, 5, 3
Postorder (Left, Right, root) : 4, 5, 2, 3, 1

*/

public class BinaryTreePractice1 {
    public static void main(String[] args) {

        Tree t = new Tree();
        Node n4 = t.makeNode(null, 4, null);
        Node n5 = t.makeNode(null, 5, null);
        Node n2 = t.makeNode(n4, 2, n5);
        Node n3 = t.makeNode(null, 3, null);
        Node n1 = t.makeNode(n2, 1, n3);

        t.setRoot(n1);

        System.out.print("preorder : ");
        t.preorder(t.getRoot());
        System.out.println();

        System.out.print("inorder : ");
        t.inorder(t.getRoot());
        System.out.println();

        System.out.print("postorder : ");
        t.postorder(t.getRoot());
        System.out.println();


    }
}







































