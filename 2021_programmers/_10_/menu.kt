// https://programmers.co.kr/learn/courses/30/lessons/72411?language=kotlin

fun comb (arr: CharArray, selectNumber: Int): ArrayList<String> {
  val resultlist = ArrayList<String>()
  fun DFS(_L: Int, _start: Int, _result: ArrayList<Char>) {
    val result = ArrayList<Char>()
    result.addAll(_result)
    if (_L == selectNumber) {
        // println(result.joinToString(""))
        resultlist.add(result.joinToString("")) 
    } else {
      for (i in _start..arr.size - 1) {
        // println(selectNumber)
        result.add(arr[i])

        DFS(_L + 1, i + 1, result)
        result.removeAt(result.size - 1)
      }
    }
  }
  DFS(0, 0, ArrayList<Char>())
  // val results = arr.foldIndexed(ArrayList<Char>()) { 
  //   idx, acc, selected -> 
  //   println(idx)
  //   acc.add(selected)
  //   acc
  // }
  // println(results)
  // println(resultlist.filter {
  //   it.length > 0
  // })
  return resultlist
}

class Solution10 {
  fun solution(orders: Array<String>, course: IntArray): Array<String> {
      val result = mutableListOf<String>()
      for (n in course) {
        val combinations = orders.fold(HashMap<String, Int>()) { 
            result, order -> 
            val _list = order.toCharArray()
            _list.sort()
            comb(_list, n).forEach {
              if (!result.containsKey(it)) {
                result.put(it, 1)
              } else {
                result.put(it, result.get(it)!! + 1)
              }
            }
            result
        }
        // println(combinations)
        val list = combinations.entries
        // println(list)
        val maxCounter = list.fold(0) {
          _max, curr ->
          if (_max < curr.value) {
            curr.value
          } else {
            _max
          }
        }
        // println(maxCounter)
        list.forEach {
          println(it)
          if (it.value == maxCounter && maxCounter > 1) result.add(it.key)
        }
          
      }
      result.sort()
      return result.toTypedArray()
  }
}

fun main(args: Array<String>) {
  val result = Solution10()  
    .solution(
      // arrayOf(
        // "ABCFG", 
        // "AC",
        // "CDE",
        // "ACDE", 
        // "BCFG", 
        // "ACDEH"
      // ),	
      // intArrayOf(2,3,4)
      arrayOf(
        "XYZ", "XWY", "WXA"
      ),	
      intArrayOf(2,3,4)
    )
  result.forEach { 
    println(it)
   }
}