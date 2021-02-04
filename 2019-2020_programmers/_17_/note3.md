## Heaters

https://leetcode.com/problems/heaters/

### 풀이

#### 예제 1

```ts
* conversion to zero base index
loc: [1,2] / heaters: [1]
[loc Range(0,2)]

rad: 1
    -----------
    *heater: [1]
    *left: [0]
    *right: [2]
    [heat range(0,2)]
    -----------
    loc: [0,1,2]
```

#### 예제 2

```ts
* conversion to zero base index
loc: [0,1,2,3] / heaters: [0, 3]
[loc Range (0,3)]

rad: 1
    -----------
    *heater: [0]
    *left: []
    *right: [1]
    [heat range(0,1)]
    -----------
    loc: [2,3]

    -----------
    *heater: [3]
    *left: [2]
    *right: []
    [heat range(2,3)]
    -----------
    loc: [2,3]

```

#### 예제 3

```
* conversion to zero base index
loc: [0,1,2,3,4,5,6] / heaters: [1, 4]
[loc Range (0,6)]

rad: 1
    -----------
    *heater: [1]
    *left: [0]
    *right: [2]
    [heat range (0,2)]
    -----------
    loc: [3,4,5,6]
    

    -----------
    *heater: [4]
    *left: [3]
    *right: [5]
    [heat range (3,5)]
    -----------
    loc: [6]

rad: 2
    -----------
    *heater: [1]
    *left: [0]
    *right: [2,3]
    [heat range (0,3)]
    -----------
    loc: [4,5,6]

    -----------
    *heater: [4]
    *left: [2,3]
    *right: [5,6]
    [heat range (2,6)]
    -----------
    loc: []
```
