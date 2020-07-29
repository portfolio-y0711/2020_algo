## Lowest common ancestor of a binary search tree

https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

### 풀이

#### 예제 1

![](./binarysearchtree_improved.png)

(p, q) = (2, 8)

```
--> stack open at depth 0
curr node: 6, [2, 8], stack: [], flag: false

    --> stack open at depth 1
    curr node: 2, [8], stack: [1], flag: false

        --> stack open at depth 2
        curr node: 0, [8], stack: [1], flag: false
        <-- stack closed at depth 2

        --> stack open at depth 2
        curr node: 4, [8], stack: [1], flag: false
        
            --> stack open at depth 3
            curr node: 3, [8], stack: [1]
            <-- stack closed at depth 3

            --> stack open at depth 3
            curr node: 5, [8], stack: [1]
            <-- stack closed at depth 3
            
        <-- stack closed at depth 2
        
    <-- stack closed at depth 1

    --> stack open at depth 1
    curr node: 8, [], stack: [1, 1]


        --> stack open at depth 2
        curr node: 7
        <-- stack closed at depth 2

        --> stack open at depth 2
        curr node: 9
        <-- stack closed at depth 2
        
    <-- stack closed at depth 1
    
<-- stack closed at depth 6

```
