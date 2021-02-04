fun main() {
    class L1512 {
        val numIdenticalPairs = { nums: IntArray ->
            nums.toMutableList().run {
                this.foldIndexed(0, { index: Int, acc: Int, _: Int ->
                    acc + this.subList(index + 1, this.size).fold(0, { acc: Int, curr: Int ->
                        if (curr == this[index]) {
                            acc + 1
                        } else {
                            acc
                        }
                    })
                })
            }
        }
    }
}
