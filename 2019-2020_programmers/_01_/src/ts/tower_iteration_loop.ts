const heights = [
  [6, 9, 5, 7, 4],
  [3, 9, 9, 3, 5, 7, 2],
  [1, 5, 3, 6, 7, 6, 5]
]

const results = [
  [0, 0, 2, 2, 4],
  [0, 0, 0, 3, 3, 3, 6],
  [0, 0, 2, 0, 0, 5, 6]
]

// const solveRecursion
//   = (arr: number[]) => {
//     const recur
//       = (acc: number[], arr: number[], ord: number): number[] => {
//         const seekRcvr
//           = (sndr: number, _arr: number[], _ord: number): number =>
//             (_ord > 0) ?
//               ((_arr[_ord - 1] > sndr) ?
//                 _ord :
//                 seekRcvr(sndr, _arr, _ord - 1)) :
//               0

//         return (ord > 0) ?
//           (acc.push(seekRcvr(arr[ord - 1], arr, ord - 1)), recur(acc, arr, ord - 1)) :
//           acc
//       }

//     return recur([], arr, arr.length).reverse()
//   }


const solveIterationLoop
  = (v: number[]) => {
    const seekRcvrLoop
      = (sndr: number, _arr: number[], _ord: number) => {
        let result: number = 0
        for (let i = _ord; i > 0; i = i - 1) {
          if (_arr[i - 1] > sndr) {
            result = i
            break
          }
        }
        return result
      }
    let acc = []
    for (let i = v.length - 1; i > -1; i = i - 1) {
      acc.push(seekRcvrLoop(v[i], v, i))
    }
    return acc.reverse()
  }

console.log(solveIterationLoop(heights[0]))
