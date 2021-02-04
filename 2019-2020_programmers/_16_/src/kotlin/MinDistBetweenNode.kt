import java.util.Vector;
import kotlin.math.abs
import kotlin.math.min

fun main(args: Array<String>) {
   val root = TreeNode(4);
   root.left = TreeNode(2);
   root.left!!.left = TreeNode(1);
   root.left!!.right = TreeNode(3);
   root.right = TreeNode(6);
    /* 예제 1/
    root = [4, 2, 6, 1, 3, null, null]
     */
    /* 예제 2/
    root = [90, 69, null, 49, 89, null, 52, null, null, null, null]
    */
    /*
    */
   println(MinDistBetweenNode().traverse(Vector<Int>(), root));
}

public class MinDistBetweenNode {
   fun traverse(nums: Vector<Int>, node: TreeNode): Int {
       println("---> stack opened @t node: " + node.val)
        /*
        */
       var min = Integer.MAX_VALUE
       var diff = Integer.MAX_VALUE
       if (node.left != null) {
           /* java/ min = Math.min(traverse(nums, node.left!!), min) */
           min = traverse(nums, node.left!!).coerceAtMost(min)
           /* log/
           */
           println("\t* left sub: $min")
       }
       println(nums)
       println("\tcur node: " + node.value)
       /* log/
       */
       if (nums.size > 0) {
           /* java/  diff = Math.abs(nums.lastElement() - node.value) */
           diff = abs(nums.lastElement() - node.value)
           /* log/
           */
           println("\tdiff: $diff")
       }
       nums.add(node.value)
       node.right.let {  }
       if (node.right != null) {
           /* java/ min = Math.min(traverse(nums, node.right!!), min) */
           min = min(traverse(nums, node.right!!), min);
           /*log/
            */
           println("\t* right sub: $min")
       }
       /* java/ min = Math.min(diff, min) */
       min = min(diff, min);
       /* log/
        */
       println( "<--- stack closed @t node: $node.value, min : $min\n" );
       return min;
   }
}
