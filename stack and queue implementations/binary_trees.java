class Node {
    int data;
    Node left;
    Node right;
    public Node(int key) {
        data= key;
        right= null;
        left= null;
    }
}
public class binary_trees {
    public static void main(String[] args) {
        System.out.println("Binary Tress repn. in java");
        Node root= new Node(108);
        root.right= new Node(108);
        root.right= new Node(108);
        System.out.println(root);
    }
}
