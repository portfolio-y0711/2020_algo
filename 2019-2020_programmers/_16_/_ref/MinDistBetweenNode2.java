
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class MinDistBetweenNode2 {
    public static void main(String[] args) {
        /* 예제 1/
        root = [4, 2, 6, 1, 3, null, null]
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
         */
        /* 예제 2/
        root = [90, 69, null, 49, 89, null, 52, null, null, null, null]
        */
        Integer[] sortedArr = new Integer[]{ 90, 69, null, 49, 89, null, 52, null, null, null, null };
//        Integer[] sortedArr = new Integer[]{49, null, 52, null, null};
        Queue<Integer> que = Arrays.stream(sortedArr).collect(Collectors.toCollection(LinkedList::new));
        TreeNode root = new TreeNode(que.poll());

        root = makeTreeNode(root, que);

        printTree(root);

//        System.out.println(
//            minDiffInBST(root)
//        );
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
           val = x;
        }
    }
    public static TreeNode makeTreeNode (TreeNode parent, Queue<Integer> que){
//        List<Integer> arr = Arrays.stream(sortedArr).collect(Collectors.toList());
//        System.out.println(que);
//        System.out.println(parent);
        Integer val;
        TreeNode left = null, right = null;
        if ((val = que.poll()) != null) {
            left = new TreeNode(val);
        }
        if ((val = que.poll()) != null) {
            right = new TreeNode(val);
        }
        if (left != null) {
            parent.left = makeTreeNode(left, (Queue<Integer>) new LinkedList<Integer>() { { add(que.poll()); add(que.poll()); } });
        }
        if (right != null) {
            parent.right = makeTreeNode(right, (Queue<Integer>) new LinkedList<Integer>() { { add(que.poll()); add(que.poll()); } });
        }

//        TreeNode left = new TreeNode(que.poll());
//        TreeNode right = new TreeNode(que.poll());
//        if (left != null) {
//           makeTreeNode(left, new Integer[] { que.poll(), que.poll()} );
//        }
//        if (right != null) {
//           makeTreeNode(left, new Integer[] { que.poll(), que.poll()} );
//        }
        return parent;
    }
    public static void printTree(TreeNode node) {
        if (node == null) return;
        printTree(node.left);
//        System.out.println(node.val);
        printTree(node.right);
    }

//    public static int minDiffInBST(TreeNode root) {
//        if (root == null) return Integer.MAX_VALUE;
//        int left, right, min = Integer.MAX_VALUE;
//        int childmin = Integer.MAX_VALUE;
//        if ((childmin = minDiffInBST(root.left)) < min) { min = childmin; }
//
////        System.out.print(root.val + " : ");
//        if (root.left == null && root.right == null) {
////            System.out.println(root.val + " (leaf)");
//            return childmin;
//        } else if (root.left != null && root.right == null) {
////            System.out.println(Math.abs(root.val - root.left.val) + " (left)");
//            if ((childmin = Math.abs(root.val - root.left.val)) < min) { min = childmin; }
//        } else if (root.right != null && root.left == null) {
////            System.out.println(Math.abs(root.val - root.right.val) + " (right)");
//            if ((childmin = Math.abs(root.val - root.right.val)) < min) { min = childmin; }
//        } else {
////            System.out.println(Math.min(Math.abs(root.val - root.left.val), Math.abs(root.val - root.right.val)) + " (both)");
//            if ((childmin = Math.min(Math.abs(root.val - root.left.val),Math.abs(root.val - root.right.val))) < min) { min = childmin; }
//        }
//        if ((childmin = minDiffInBST(root.right)) < min) { min = childmin; }
////       return (int) Collections.min(Arrays.asList(new Integer[]{root.left.val, root.val, root.right.val}));
//        return min;
//    }
}
