## Sum of root to leaf binary numbers

https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/

### 풀이

#### 예제 1

```
      1
    /   \
   0     1
 /  \   /  \
0    1 0    1

[1, 0, 1, 0, 1, 0, 1]

--> stack open at depth 0
curr node: 1, stack: [1]

    # left
    --> stack open at depth 1
    curr node: 0, stack: [1, 0]

        ## left -> left
        --> stack open at depth 2
        curr node: 0, stack:  [1, 0, 0]
        comb: [[1,0,0]]
        <-- stack closed at depth 2

        ### left -> right
        --> stack open at depth 2
        curr node: 1, stack: [1, 0, 1]
        comb: [[1,0,0], [1,0,1]]
        <-- stack closed at depth 2

    <-- stack closed at depth 1

    ## right
    --> stack open at depth 1
    curr node: 1, stack: [1, 1]

        ### right -> left
        --> stack open at depth 2
        curr node: 0, stack: [1, 1, 0]
        comb: [[1,0,0], [1,0,1], [1,1,0]]
        <-- stack closed at depth 2

        #### right -> right
        --> stack open at depth 2
        curr node: 1, stack: [1, 1, 1]
        comb: [[1,0,0], [1,0,1], [1,1,0], [1,1,1]]
        <-- stack closed at depth 2

    <-- stack closed at depth 1
<-- stack closed at depth 0

100 + 101 + 110 + 111
= 4 + 5 + 6 + 7
= 22

```
