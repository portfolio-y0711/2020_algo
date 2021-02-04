import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

fun main(args: Array<String>) {
   val sortedArr: IntArray = intArrayOf(-10, -3, 0, 5, 9)
   SortedArrToBst().printTree(sortedArrayToBST(sortedArr));
}
public class SortedArrToBst {
   fun sortedArrayToBST(arr: IntArray): TreeNode? {
       if (arr.size == 0) return null;
       /*log/
       */
       var mid: Int;
       var node: TreeNode = TreeNode(arr[arr.size/ 2]);
       /* log/
        */
//        println("length: $arr.length , array: ${Arrays.stream(arr).boxed().collect(Collectors.toCollection(LinkedList::new)))}"
       mid = arr.size
       println("mid: ${mid / 2}, el: ${arr[mid / 2]}")
       println("$node\n");
       var left = Arrays.stream(arr).limit((arr.size / 2).toLong()).toArray();
       var right = Arrays.stream(arr).skip((arr.size/ 2 + 1).toLong()).limit((arr.size/ 2).toLong()).toArray();
       node.left = sortedArrayToBST(left);
       node.right = sortedArrayToBST(right);
       return node;
   }

  fun printTree(node: TreeNode): Unit {
       if (node == null) return
       printTree(node.left!!)
       println(node.value)
       printTree(node.right!!)
   }
}


class TreeNode(val value: Int) {
   var left: TreeNode? = null
   var right: TreeNode? = null
   override fun toString(): String  {
       return "Node($this.val)"
   }
}
