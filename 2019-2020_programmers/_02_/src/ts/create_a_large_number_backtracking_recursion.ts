const nums = [
    "1924",
    "1231234",
    "4177252841"
  ]
  
  const arrToDigits 
    = (arr: number[]) => {
      const recur
        = (arr: number[], digit: number, acc: number = 0): number => {
          acc += Math.pow(10, digit) * arr[arr.length - 1 - digit]
          return (digit < arr.length - 1) ?
            recur(arr, digit + 1, acc) :
           acc 
        }
      return recur(arr, 0)
    }
  
    const pickNumbersRecursion
    = (numStr: string, k: number) => {
      const acc: number[] = []
      const arr = numStr.split('')
                    .map(x => parseInt(x))
      const recur
        = (picked: number[], cursor: number) => {
          if (cursor > arr.length - 1) {
            if (picked.length == arr.length - k) {
              acc.push(arrToDigits(picked))
            }
          } else {
            picked.push(arr[cursor])
            recur(picked, cursor + 1)
            picked.pop()
            recur(picked, cursor + 1)
          }
        }
      recur([], 0)
      return Math.max.apply(null, acc)
    }
  
  
  
  console.log(pickNumbersRecursion(nums[0], 2))
  console.log(pickNumbersRecursion(nums[1], 3))
  console.log(pickNumbersRecursion(nums[2], 4))
  
  