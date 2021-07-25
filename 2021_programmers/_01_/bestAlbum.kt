// https://programmers.co.kr/learn/courses/30/parts/12077

class Solution01 {
  fun solution(genres: Array<String>, plays: IntArray): IntArray {
    // println(
    val genresMap = genres.indices.groupBy { 
      genres[it]
    }
    
    val genresMapList = genresMap
      .entries
      .sortedByDescending { 
        it.value.map { idx -> plays[idx] }.sum()
       }

    val albumList = genresMapList.map { 
      it.value.map { idx -> Pair(idx, plays[idx]) }
      .sortedByDescending { 
        it.second
      }
      .take(2)
      .map { pair -> pair.first }
     }.flatten()
    return albumList.toIntArray()
  }
}

fun main(args: Array<String>) {
  println(Solution01().solution(
    arrayOf("classic", "pop", "classic", "classic", "pop"),
    intArrayOf(500, 600, 150, 800, 2500)
  ))
}