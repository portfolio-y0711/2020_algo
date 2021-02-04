// val tArr = [
//     [["ICN", "JFK"], ["HND", "IAD"], ["JFK", "HND"]],
//     [["ICN", "SFO"], ["ICN", "ATL"], ["SFO", "ATL"], ["ATL", "ICN"], ["ATL","SFO"]],
//     [["ICN", "SFO"], ["SFO", "ICN"], ["ICN", "ATL"]]
// ]

// rArr = [
//     ["ICN", "JFK", "HND", "IAD"],
//     ["ICN", "ATL", "ICN", "SFO", "ATL", "SFO"],
//     ["ICN", "SFO", "ICN", "ATL"]
// ]

val tickets: List<List<List<String>>> = listOf(
    listOf( listOf("ICN", "JFK"), listOf("JFK", "HND"), listOf("JFK", "HND") ),
    listOf( listOf("ICN", "SFO"), listOf("ICN", "ATL"), listOf("SFO", "ATL"), listOf("ATL", "ICN"), listOf("ATL","SFO") ),
    listOf( listOf("ICN", "JFK"), listOf("JFK", "HND"), listOf("JFK", "HND") )
)

// val returns: List<List<List<String>>> = listOf(
//     listOf( listOf("ICN", "JFK"), listOf("JFK", "HND"), listOf("JFK", "HND") ),
//     listOf( listOf("ICN", "SFO"), listOf("ICN", "ATL"), listOf("SFO", "ATL"), listOf("ATL", "ICN"), listOf("ATL","SFO") ),
//     listOf( listOf("ICN", "JFK"), listOf("JFK", "HND"), listOf("JFK", "HND") )
// )

// fun traverse(arr: List<String>){
    // arr.flatten()

// }

//fun main(){
//    val alist = getTickets[0].flatten().sorted()
//    println(alist)
//    val encode = mapOf<String, Int>()
//    val decode = mapOf<Int, String>()
//    var num : Int = 0
//    for (airport:String in alist){
//        if encode
//    }
//}

//import itertools
//def traverse(arr):
//alist = list(itertools.chain(*arr))
//alist.sort()
//t = arr
//
//encode = {}
//decode = {}
//num = 0
//for airport in alist:
//if encode.get(airport, None) is None:
//encode[airport] = num
//decode[num] = airport
//num = num + 1
//
//d = len(encode.keys())
//mat = [[0 for i in range(d)] for j in range(d)]
//
//for i in range(len(t)):
//mat[encode.get(t[i][0])][encode.get(t[i][1])] = 1
//
//h = []
//i = encode['ICN']
//
//def dig(i):
//for j in range(len(mat[i])):
//if mat[i][j] == 1:
//mat[i][j] = mat[i][j] - 1
//dig(j)
//h.append(i)
//
//dig(i)
//h.reverse()
//return [decode[x] for x in h]
//
//
//def solution(tickets):
//return traverse(tickets)
//
