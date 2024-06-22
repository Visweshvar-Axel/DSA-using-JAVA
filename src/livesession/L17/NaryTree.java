package livesession.L17;

import java.util.ArrayList;
import java.util.List;

class NaryNode {
    int value;
    List<NaryNode> children;
    public NaryNode(int value) {
        this.value = value;
        children = new ArrayList<>();
    }
}
public class NaryTree {

        NaryNode root;

        NaryTree(int value) {
            root = new NaryNode(value);
        }

        void addChild(NaryNode parent, int value) {
            NaryNode child = new NaryNode(value);
            parent.children.add(child);
        }

        void printTree(NaryNode node) {
            if (node == null) return;
            System.out.print(node.value + " ");
            for (NaryNode child : node.children) {
                printTree(child);
            }
        }
        public static void main(String[] args) {
            NaryTree tree = new NaryTree(1);
            tree.addChild(tree.root, 2);
            tree.addChild(tree.root, 3);
            tree.addChild(tree.root, 4);
            tree.addChild(tree.root.children.get(0), 5);
            tree.addChild(tree.root.children.get(0), 6);

            tree.printTree(tree.root);
        }
    }

