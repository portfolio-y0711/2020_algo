## Two Sum IV - Input is a BST

https://leetcode.com/problems/two-sum-iv-input-is-a-bst/

### 풀이

##### 예제 1

```ts

    5
   / \
  3   6
 / \   \
2   4   7

tree:
[2]
[2, 3]
[2, 3, 4]
[2, 3, 4, 5]
[2, 3, 4, 5, 6]
[2, 3, 4, 5, 6, 7]

comb:
[2, 3] [2, 4] [2, 5] [2, 6] [2, 7]
-> 5, 6, 7, 8, 9
[3, 4] [3, 5] [3, 6] [3, 7]
-> 7, 8, 9, 10
[4, 5] [4, 6] [4, 7]
-> 9, 10, 11
[5, 6] [5, 7] 
-> 11, 12
[6, 7]
-> 13

```

##### 예제 2

##### 예제 3

### 코드

* [java](./_java/BstPlusTwo.java)

* [kotlin](./_java/BstPlusTwo.java)
