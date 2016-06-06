package binaryTree;

public class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        if (!this.contains(value)) this.value = value;
        this.left = null;
        this.right = null;
    }

    private boolean contains(int value) {
        return this.value == value || this.left != null && this.left.contains(value) || this.right != null && this.right.contains(value);
    }

    public void add(Node node) {
        
    }
}
