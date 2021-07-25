function solution(relation) {
  var combinations = [];
  var rows = relation.length;
  var columns = relation[0].length;

  for (var i = 1; i <= (1 << columns) - 1; i++) {
    const keyMaps = {}
    for (let j = 0; j < rows; j++) {
      const records = [];
      for (let k = 0; k < columns; k++) {
        if (i & (1 << k)) {
          records.push(relation[j][k]);
        }
      }
      if (records.join("-") in keyMaps) {
        keyMaps[records.join("-")] = keyMaps[records.join("-")] + 1;
      } else {
        keyMaps[records.join("-")] = 1;
      }
    }
    console.log(keyMaps)
    const isUnique = Object.keys(keyMaps).length == rows
    
    if (isUnique && isMinimal(combinations, i)) {
      combinations.push(i);
    }
  }

  function isMinimal(answers, now) {
    for (var i = 0; i < answers.length; i++) {
      // console.log(`answers[i] & now: ${answers[i] & now}, answers[i]: ${answers[i]}, result: ${(answers[i] & now) == answers[i]}`)
      if ((answers[i] & now) == answers[i]) {
        return false;
      }
    }

    return true;
  }
  return combinations.length;
}

console.log(
  solution(
  [
    ["100","ryan","music","2"],
    ["200","apeach","math","2"],
    ["300","tube","computer","3"],
    ["400","con","computer","4"],
    ["500","muzi","music","3"],
    ["600","apeach","music","2"]
  ]	
  )
)
