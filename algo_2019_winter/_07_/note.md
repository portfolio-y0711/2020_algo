## 프렌즈4블록

https://programmers.co.kr/learn/courses/30/lessons/17679


### 풀이

##### 예제 1

```ts

[CCBDE, AAADE, AAABF, CCBBF]

*  
CCBDE
AAADE
AAABF
CCBBF

------------
[match]

CCBDE
***DE
***BF
CCBBF

[crash]

CCBDE
...DE
...BF
CCBBF

[descend]

...DE
...DE
CCBBF
CCBBF

------------
[match]

...DE
...DE
****F
****F

[crash]
...DE
...DE
....F
....F

[descend]
....E
....E
...DF
...DF

```

##### 예제 2

```ts

[TTTANT, RRFACC, RRRFCC, TRRRAA, TTMMMF, TMMTTJ]    

*
TTTANT
RRFACC
RRRFCC
TRRRAA
TTMMMF
TMMTTJ    
------------

[match]

TTTANT
**FA**
***F**
T**RAA
TTMMMF
TMMTTJ    

[crash]

TTTANT
..FA..
...F..
T..RAA
TTMMMF
TMMTTJ    

[descend]
...A..
...A..
T.TFNT
TTFRAA
TTMMMF
TMMTTJ    

------------
[match]
...A..
...A..
T.TFNT
**FRAA
**MMMF
TMMTTJ    

[crash]
...A..
...A..
T.TFNT
..FRAA
..MMMF
TMMTTJ    

[descend]
...A..
...A..
..TFNT
..FRAA
T.MMMF
TMMTTJ    
```


### 코드 및 실행결과

* [typescript](./_typescript/friends_4_blocks.ts)


