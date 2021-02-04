package leetcode

object RecursionPrincipleKt {
    @JvmStatic fun printReverse(str: CharArray) {
        fun helper(index: Int, str: CharArray) {
            if (index >= str.size) {
                return
            }
            helper(index + 1, str)
            println(str[index])
        }
        helper(0, str)
    }
}

