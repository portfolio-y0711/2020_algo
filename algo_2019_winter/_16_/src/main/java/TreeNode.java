public class TreeNode {
    int value;
    TreeNode left, right;
    TreeNode(int val) { this.value = val; }
    @Override
    public String toString() {
        return "Node(" + this.value + ")";
    }
}
