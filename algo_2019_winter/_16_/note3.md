
## Minimum Distance Between BST Nodes

https://leetcode.com/problems/minimum-distance-between-bst-nodes/

### 풀이


##### 예제 1

```ts

root : [4, 2, 6, 1, 3, null, null]

          4
        /   \
      2      6
     / \    
    1   3 


---> stack opened at node: 4
---> stack opened at node: 2
---> stack opened at node: 1
[]
    cur node: 1
<--- stack closed at node: 1, min :2147483647

    * left sub: 2147483647
[1]
    cur node: 2
    diff: 1
---> stack opened at node: 3
[1, 2]
    cur node: 3
    diff: 1
<--- stack closed at node: 3, min :1

    * right sub: 1
<--- stack closed at node: 2, min :1

    * left sub: 1
[1, 2, 3]
    cur node: 4
    diff: 1
---> stack opened at node: 6
[1, 2, 3, 4]
    cur node: 6
    diff: 2
<--- stack closed at node: 6, min :2

    * right sub: 1
<--- stack closed at node: 4, min :1

```

##### 예제 2
```ts
           90
           /    
         69    
        /  \    
      49    89
     /      
   52

root = [90, 69, null, 49, 89, null, 52, null, null, null, null]

# que = [90, 69, null, 49, 89, null, 52, null, null, null, null]
parent = null
curr = 90

# que = [69, null, 49, 89, null, 52, null, null, null, null]
parent = 90
curr = 69

```

##### 예제 3

### 코드

* [java](./_java/MinDistBetweenNode.java)

![](img/MinDistBetweenNode.png)

* [kotlin](./_kotlin/MinDistBetweenNode.kt)

<!-- * [Rust](./min_dist_between_node.rs) -->
