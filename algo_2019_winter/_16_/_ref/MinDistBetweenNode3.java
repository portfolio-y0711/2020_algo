//public class MinDistBetweenNode3 {
//    public static void main(String[] args) {
//        TreeNode root = new TreeNode(4);
//        root.left = new TreeNode(2);
//        root.left.left = new TreeNode(1);
//        root.left.right = new TreeNode(3);
//        root.right = new TreeNode(6);
//        /* 예제 1/
//        root = [4, 2, 6, 1, 3, null, null]
//         */
//        /* 예제 2/
//        root = [90, 69, null, 49, 89, null, 52, null, null, null, null]
//        */
//        System.out.println(traverse(root));
//    }
//    public static int traverse(TreeNode node) {
////        System.out.println("called");
//        if (node == null) return Integer.MAX_VALUE;
//        int min = Integer.MAX_VALUE;
//        int cur = 0;
//        if (node.left == null && node.right == null) {
//            System.out.println("node val: " + node.val + ", leaf");
//            return Integer.MAX_VALUE;
//        } else if (node.right == null && node.left != null) {
//            min = Math.min(Math.abs(node.left.val - node.val), traverse(node.left));
//            System.out.println("node: " + node.val + ", left: " + node.left.val + ", right: null");
//        } else if (node.left == null && node.right != null) {
//            min = Math.min(Math.abs(node.right.val - node.val), traverse(node.right));
//            System.out.println("node: " + node.val + ", left: null, right: null"+ node.left.val);
//        } else {
//            System.out.println("node: " + node.val + ", left: " + node.left.val + ", right: " + node.right.val);
//            if ((cur = traverse(node.left)) < min) min = cur;
//            if ((cur = traverse(node.right)) < min) min = cur;
//            if ((cur = Math.min(Math.abs(node.right.val - node.val), Math.abs(node.left.val - node.val))) < min) {
//               min = cur;
//            };
//        }
//
////        (node.left != null && node.right != null) {
////            System.out.println("left: " + node.left.val + ", right: " + node.right.val);
//////            min = Math.min(Math.abs(node.left.val - node.val), Math.abs(node.right.val - node.val));
//        System.out.println(min);
//        return min;
//    }
//
//}
