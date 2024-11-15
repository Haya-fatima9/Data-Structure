class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BalancedTree{
    
    // Function to check if tree is balanced
    public boolean balanceTree(Node root) {
        return checkHeight(root) != -1;
    }

    // Helper function to check height and balance
    private int checkHeight(Node node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) return -1; // Left subtree is not balanced

        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) return -1; // Right subtree is not balanced

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1; // Current node is not balanced
        }

        return Math.max(leftHeight, rightHeight) + 1; // Return height if balanced
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Example to create a balanced tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println("Is the tree balanced? " + tree.balanceTree(root));
    }
}



