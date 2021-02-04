class Node2 {
    int data;
    Node2 left, right;
    Node2(int d) { data = d; }
}

public class BinaryTree {
    static Node2 root;
    Node2 sortedArrayToBST(int arr[], int start, int end) {
        if (start > end) { return null; }
        int mid = (start + end) / 2;
        Node2 node = new Node2(arr[mid]);
        node.left = sortedArrayToBST(arr, start, mid - 1);
        node.right = sortedArrayToBST(arr, mid + 1, end);
        return node;
    }

    void preOrder(Node2 node) {
        if (node == null) { return; }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
//        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        int arr[] = new int[]{-10,-3,0,5,9};
        int n = arr.length;
        root = tree.sortedArrayToBST(arr, 0, n - 1);
        System.out.println("Preorder traversal of constructed BST");
        tree.preOrder(root);
    }
}

