## 셔틀버스

https://programmers.co.kr/learn/courses/30/lessons/17678

#### 풀이


##### 예제 1

```ts
|1|1|5/08:00|08:01|08:02|08:03|09:00|

n = 1, t = 1, m = 5
timetable: 
        [00:01, 00:01, 00:01, 00:01, 00:01]

# n: 0, current_time: 09:00
  crew 5 arrived
        [ 00:01,00:01,00:01,00:01,00:01 ]

00:00
```

##### 예제 2

```ts
|2|10|2/09:10|09:09|08:00|09:09|    
```

##### 예제 3

```ts
|2|10|2/09:10|09:09|08:00|09:09|    
```

##### 예제 4

```ts
|2|10|2/09:10|09:09|08:00|09:09|    
```

##### 예제 5

```ts
|2|1|2/09:00|09:00|09:00|09:00|08:59

---------------------
n = 2, t = 1, m = 2
timetable: 
        [09:00, 09:00, 09:00, 09:00]
---------------------

# n: 1, current_time: 09:00
  crew 4 arrived
        [ 09:00,09:00,09:00,09:00 ]

# n: 1, current_time: 09:01
  crew 2 arrived
        [ 09:00,09:00 ]
08:59
```

##### 예제 6

```ts
|1|1|5/00:01|00:01|00:01|00:01|00:01|00:00
```

##### 예제 7

```ts
|1|1|1/23:59|09:00
```

##### 예제 8

```ts
|10|60|45/23:59|23:59|23:59|23:59|23:59|23:59|23:59|23:59|23:59|23:59|23:59|23:59|23:59|23:59|23:59|23:59|18:00|
```

##### 예제 9

```ts
|2|10|3/09:00|09:00|09:00|09:10|09:10|
```

##### 예제 10

```ts
|2|10|2/09:00|09:00|09:10|09:05|09:08|09:07|
```

### 코드 및 실행결과

* []()
* []()
* []()
* []()


### 참고자료

* [Do it in Java 8: Recursive lambdas](https://dzone.com/articles/do-it-java-8-recursive-lambdas)
* [Implement recursive lambda function using Java 8](https://stackoverflow.com/questions/19429667/implement-recursive-lambda-function-using-java-8)
* [Java Lambda (7) 람다와 클로저](https://futurecreator.github.io/2018/08/09/java-lambda-and-closure/)
* [람다가 이끌어 갈 모던 Java](https://d2.naver.com/helloworld/4911107)
