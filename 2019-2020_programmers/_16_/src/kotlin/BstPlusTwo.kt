import java.util.LinkedList;

fun main(args: Array<String>) {
    val root: TreeNode  = TreeNode(5)
    root.left = TreeNode(3);
    root.right = TreeNode(6);
    root.left!!.left = TreeNode(2);
    root.left!!.right = TreeNode(4);
    root.right!!.right = TreeNode(7);
    println(BstPlusTwo().findTarget(root, 9));
    println("\ncomb:");
}

class BstPlusTwo {
    private val sArr = LinkedList<Int>()
    private val comb = LinkedList<Int>()
    private val snapshot = LinkedList<LinkedList<Int>>();
    private val combset = LinkedList<LinkedList<Int>>();

    fun findTarget(root: TreeNode, k: Int): Unit {
        traverse(root);
        /* log/ */println();
        var n: Int = sArr.size;
        var d = 2;
        var start = 0;
        dfs(n, d, start);
//        return combset.stream().map(x -> x.get(0) + x.get(1)).collect(Collectors.toCollection(HashSet::new)).contains(k);
    }

    private fun dfs(n: Int, d: Int, start: Int): Unit {
        if (comb.size == d) {
            combset.add(comb.clone() as LinkedList<Int>)
            /* log/ */snapshot.add(comb.clone() as LinkedList<Int>);
            /* log/ */print(comb);
        }
        for (i in start until n) {
            comb.add(sArr[i]);
            dfs(n, d, i + 1);
            if (comb.size == d && i == n - 1) {
            println(comb)
            println(snapshot.map { x -> x[0] + x[1] }.joinToString(separator = ", ") { y -> y.toString() })
            /*
             */
//            println("\n-> " + snapshot.stream().map(x -> x.get(0) + x.get(1)).map(y -> y.toString()).collect(Collectors.joining(", ")));
//            println("\n-> ${snapshot.stream().map((x:Int) -> x.get(0) + x.get(1)).map(y -> y.toString()).collect(Collectors.joining(", "))}");
//            snapshot.clear()
            }
            comb.remove(comb.size - 1);
        }
    }

    private fun traverse(node: TreeNode): Unit {
        if (node == null) return;
        node.left?.let { traverse(it) }
        sArr.add(node.value)
        /* log/ */println(sArr);
        node.right?.let { traverse(it) }
    }
}

//class TreeNode(var value: Int){
//    var left: TreeNode? = null
//    var right: TreeNode? = null
//
//    override fun toString(): String {
//        return "Node($this.val)"
//    }
//}
