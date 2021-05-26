const participants = [
  ["leo", "kiki", "eden"],
  ['marina', 'josipa', 'nikola', 'vinko', 'filipa'],
  ['mislav', 'stanko', 'mislav', 'ana']
]

const completions = [
  ['eden', 'kiki'],
  ['josipa', 'filipa', 'marina', 'nikola'],
  ['stanko', 'ana', 'mislav']
]

const solution
  = (_participants: string[], _completions: string[]) => {

    const completionMap
      = _completions.reduce((acc: Map<string, number>, curr: string) => {
        if (!acc.has(curr)) {
          acc.set(curr, 1)
        } else {
          acc.set(curr, acc.get(curr)! + 1)
        }
        return acc
      }, new Map<string, number>())
    
      for (let participant of _participants) {
        if (!completionMap.has(participant)) {
            return participant
        }
      }
  }

console.log(solution(['leo', 'eden', 'kiki'], ['eden', 'kiki']))
console.log(solution(participants[1], completions[1]))
console.log(solution(participants[2], completions[2]))
