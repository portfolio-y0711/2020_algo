import java.util.*

class Solution02 {
  fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
      var time = 0
      var trucksOnBridge: Queue<Int> = LinkedList()
      var truckQ: Queue<Int> = LinkedList()

      for (i in 0 until bridge_length) {
        trucksOnBridge.add(0)
      }

      for (i in 0..truck_weights.lastIndex) {
        truckQ.offer(truck_weights[i])
      }

      while (!trucksOnBridge.isEmpty()) {
        trucksOnBridge.poll()
        if (!truckQ.isEmpty()) {
          val totalWeight = trucksOnBridge.fold<Int, Int>(0) { 
            a, b -> a + b 
          }
          if (totalWeight + truckQ.peek() <= weight) {
            val truck = truckQ.poll()
            trucksOnBridge.add(truck)
          } else {
            trucksOnBridge.add(0)
          }
          time++
        }
      }
      return time
  }
}

fun main(args: Array<String>) {
    Solution02()
      .solution(2, 10, intArrayOf(7, 4, 5, 6))
}