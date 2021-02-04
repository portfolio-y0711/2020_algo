fun reverseString(str: CharArray): Unit {
    var left = 0
    var right = str.size - 1
    while (left < right) {
        val tmp = str[left]
        str[left++] = str[right]
        str[right--] = tmp
    }
    println(str)
}
