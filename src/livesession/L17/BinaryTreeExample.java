package livesession.L17;
class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}
public class BinaryTreeExample {
    Node root;

    BinaryTreeExample() {
        root = null;
    }

    void insert(int value) {
        root = insertRec(root, value);
    }

    Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value)
            root.left = insertRec(root.left, value);
        else if (value > root.value)
            root.right = insertRec(root.right, value);
        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }
    void getRoot(){
        if (root!=null) System.out.println("Root value: "+root.value);
        else System.out.println("Root is null");
    }

    public static void main(String[] args) {
        BinaryTreeExample tree = new BinaryTreeExample();
        tree.insert(6);
        tree.insert(3);
        tree.insert(2);
        tree.insert(4);
        tree.insert(7);
        tree.insert(5);
        tree.insert(8);
        tree.insert(1);
        /* *
        *                  6
        *                /   \
        *               3      7
        *             /   \   /   \
        *            2     4  5     8
        *          /   \
        *         1    NULL
        *
        *
        * */
        tree.getRoot();
        System.out.println(tree.root.value);
        tree.inorder();
    }

}
