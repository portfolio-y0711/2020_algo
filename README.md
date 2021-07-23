## 얄고리즘 스터디

<br/>

> 알고리즘
>

<br/>

<font color="red">

목차 

</font>

1. [코드 작성 원칙](###-1.-코드-작성-원칙)

2. [알고리즘 실습 코드](###-2.-알고리즘-실습-코드)

    [▸ JAVA](####-<font-color="red"><strong>JAVA<strong></font>)

    [▸ PYTHON](####-<font-color="red"><strong>PYTHON<strong></font>)

    [▸ RUST](####-<font-color="red"><strong>RUST<strong></font>)

    [▸ KOTLIN](####-<font-color="red"><strong>KOTLIN<strong></font>)

    [▸ TYPESCRIPT](####-<font-color="red"><strong>TYPESCRIPT<strong></font>)

3. [자료구조 / 기초 알고리즘 정리](###-3.-자료구조-/-기초-알고리즘-정리)  

    [▸ 자료구조](####-3-1.-자료구조)
 
    [▸ 기초 알고리즘](####-3-2.-기초-알고리즘 )

<br/>

### 1. 코드 작성 원칙 

<details open><summary>(닫기...)</summary>

<br/>

✨ **_다양한 언어_** 로 작성해보기: 

* 여러 언어로 작성하여 언어별 특성(**_표현력, 성능, 기능_**)과 장단점을 비교

* 각각의 언어가 추구하는 명확하고 간결한 표현 방식을 우선(shorter syntax)

<br/>

✨ 언어가 제공하는 **_기본 라이브러리_** 에 익숙해지기:

* 자료구조는 직접 구현하기 보다는 가능한 **_언어별 standard library_** 를 우선 사용 

* 연산은 **_functional_** api를 우선해서 사용함

<br/>

✨ 문제의 출제 의도, 모범 풀이 방식에 구애받지 않는 **_다양한 코딩 sytle_** 을 시도하기 

* recursive loop 처리를 요하는 문제는 **_tail recursion -> loop_** 순으로 두 가지를 모두 구현

* recursive loop 는 **_iteration loop_** 으로도 바꿔 볼 것 

* 문제 의도와 무관하게 **_병행(parallel) 처리, 동시성(concurrency)_** 처리에 대해 생각해볼 것

<br/>

✨ 알고리즘 외에도 **_다양한 환경 구성_** 을 연습해보기: 

* 자주 사용하지 않는 **_빌드툴, 테스팅 툴_** 을 우선적으로 사용해 볼 것 

* 코드 편집, 문서 작성시에도 **_새로운 시도_** 를 해본다. 

</details>

<br/>

### 2. 알고리즘 실습 코드 

<details open><summary>(전체 닫기...)</summary>

#### <font color="red"><strong>JAVA<strong></font>

<details open><summary>(닫기...)</summary>

* [큰 수 만들기](2019-2020_programmers/_02_/src/java/CreateLargeNumber.java)

* [캐시](2019-2020_programmers/_03_/src/java/Cache.java)

* [문자열 압축](2019-2020_programmers/_03_/src/java/StringCompression.java)

* [124 나라](2019-2020_programmers/_05_/src/java/Number124Country.java)

* [영어 끝말잇기](2019-2020_programmers/_06_/src/java/WordConcat.java)

* [후보키](2019-2020_programmers/_08_/src/java/Candidate_keys_backtrack_fail.java)

* [디스크 컨트롤러](2019-2020_programmers/_09_/src/java/DiskController.java)

* [팰린드롬1: 자바 클로저](2019-2020_programmers/_10_/src/java/PalindromeJavaClosure.java)

* [팰린드롬2: 재귀](2019-2020_programmers/_10_/src/java/PalindromeRecursiveLoop.java)

* [팰린드롬3: 공재귀](2019-2020_programmers/_10_/src/java/PalindromeTailRecursion.java)/

* [셔틀버스](2019-2020_programmers/_11_/src/java/ShuttleBusTailRecursion.java)

* [Largest Rectangle In Histogram](2019-2020_programmers/_14_/src/java/Solution.java);

* [Capacity To Ship Packages Within D Days](2019-2020_programmers/_15_/src/java/ShipWithinDays.java);

* [Min Dist Between Node](2019-2020_programmers/_16_/src/java/MinDistBetweenNode.java);

* [BST Plus Two](2019-2020_programmers/_16_/src/java/BstPlusTwo.java);

* [Sorted Array To BST](2019-2020_programmers/_16_/src/java/SortedArrToBst.java);

* [Number of Good Pairs](2019-2020_programmers/_17_/src/kotlin/KNumberOfGoodPairs.kt);

<br/>

</details>

#### <font color="red"><strong>PYTHON<strong></font>

<details open><summary>(닫기...)</summary>

* [완주하지 못한 선수](2019-2020_programmers/_01_/src/python/an_unfulfilled_player_double_loop.py)

* [타워](2019-2020_programmers/_01_/src/python/tower_stack.py)

* [큰 수 만들기](2019-2020_programmers/_02_/src/python/create_a_large_number.py)

* [캐시](2019-2020_programmers/_03_/src/python/cache.py)

* [문자열 압축](2019-2020_programmers/_03_/src/python/string_compression_python.py)

* [여행경로1](2019-2020_programmers/_04_/src/python/travel_route_head_recursion.py)

* [여행경로2](2019-2020_programmers/_04_/src/python/travel_route_tail_recursion.py)

* [124 나라](2019-2020_programmers/_05_/src/python/number_124_country_python.py)

* [위장](2019-2020_programmers/_06_/src/python/camouflage.py)

* [조이스틱](2019-2020_programmers/_06_/src/python/joystick.py)

* [영어 끝말잇기](2019-2020_programmers/_06_/src/python/word_concat.py)

<br/>
</details>

#### <font color="red"><strong>RUST<strong></font>

<details open><summary>(닫기...)</summary>

* [완주하지 못한 선수](2019-2020_programmers/_01_/src/rust/an_unfulfilled_player.rs)

* [타워](2019-2020_programmers/_01_/src/rust/tower.rs)

* [큰 수 만들기](2019-2020_programmers/_02_/src/rust/createALargeNumber.rs)

* [영어 끝말잇기](2019-2020_programmers/_06_/src/rust/word_concat.rs)

<br/>
</details>

#### <font color="red"><strong>KOTLIN<strong></font>

<details open><summary>(닫기...)</summary>

* [큰 수 만들기](2019-2020_programmers/_02_/src/kotlin/createLargeNumber.kt)

* [캐시](2019-2020_programmers/_03_/src/kotlin/Cache.kt)

* [여행경로](2019-2020_programmers/_04_/src/kotlin/TravelRoute.kt)

* [영어 끝말잇기](2019-2020_programmers/_06_/src/kotlin/wordConcat.kt)

* [위장](2019-2020_programmers/_06_/src/kotlin/Camouflage.kt)

* [Longest String Chain](2019-2020_programmers/_13_/src/kotlin/Solution.kt)

* [Capacity To Ship Packages Within D Days](2019-2020_programmers/_15_/src/kotlin/shipWithinDays.kt)

* [Min Dist Between Node](2019-2020_programmers/_16_/src/kotlin/MinDistBetweenNode.kt)

* [BST Plus Two](2019-2020_programmers/_16_/src/kotlin/BstPlusTwo.kt)

* [Sorted Array To BST](2019-2020_programmers/_16_/src/kotlin/SortedArrToBst.kt)

* [Number of Good Pairs](2019-2020_programmers/_17_/src/kotlin/KNumberOfGoodPairs.kt)

<br/>
</details>

#### <font color="red"><strong>TYPESCRIPT<strong></font>

<details open><summary>(닫기...)</summary>

* [타워(tail recursion)](2019-2020_programmers/_01_/src/typescript/tower_tail_recursion.ts) &nbsp; /
    &nbsp; [타워(iteration loop)](2019-2020_programmers/_01_/src/typescript/tower_iteration_loop.ts)

* [큰 수 만들기](2019-2020_programmers/_02_/src/create_a_large_number_js.ipynb) &nbsp; / &nbsp; [큰 수 만들기(recursive backtracking)](2019-2020_programmers/_02_/src/ts/create_a_large_number_backtracking_recursion.ts)

* [영어 끝말잇기](2019-2020_programmers/_06_/src/typescript/word_concat.js)

* [프렌즈4블록](2019-2020_programmers/_07_/src/typescript/friends_4_blocks.ts)

* [후보키1](2019-2020_programmers/_08_/src/typescript/candidate_key_bit.ts)

* [후보키2](2019-2020_programmers/_08_/src/typescript/CandidateKey.js)

* [디스크 컨트롤러](2019-2020_programmers/_09_/src/typescript/producer_consumer_log.ts)

* [셔틀버스1: 재귀](2019-2020_programmers/_11_/src/typescript/shuttle_bus_recursive_loop.ts)

* [셔틀버스2: 공재귀](2019-2020_programmers/_11_/src/typescript/shuttle_bus_tail_recursion.ts)

* [가장 큰 사각형 찾기](2019-2020_programmers/_12_/src/typescript/find_the_largest_square.ts)

* [Longest String Chain](2019-2020_programmers/_13_/src/typescript/longest_string_chain.ts)

* [Largest Rectangle In Histogram](2019-2020_programmers/_14_/src/typescript/largest_rectangle.ts)

</details>
<br/><br/>

</details>

<br/><br/>

### 3. 자료구조 / 기초 알고리즘 정리 

<details open><summary>(닫기...)</summary>

#### 3-1. 자료구조
 
* [트리 ▸▸▸▸▸▸▸▸▸▸▸▸▸▸ 바로가기](./docs/Tree/note.md)

* [이진탐색트리 ▸▸▸▸▸▸▸▸ 바로가기](./docs/Tree/BinarySearchTree/note.md)

* [그래프 ▸▸▸▸▸▸▸▸▸▸▸▸ 바로가기](./docs/Graph/note.md)
    

#### 3-2. 기초 알고리즘 

* [이분탐색 ▸▸▸▸▸▸▸▸▸▸▸▸ 바로가기](./docs/BinarySearch/note.md)

* [BFS / DFS ▸▸▸▸▸▸▸▸▸ 바로가기](./docs/BFS_DFS/note.md)

</details>

<br/>

