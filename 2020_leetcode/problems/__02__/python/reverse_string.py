def reverseString(str):
    left = 0
    right = len(str) - 1
    while (left < right):
        tmp = str[left]
        str[left] = str[right]
        left +=1
        str[right] = tmp
        right -=1
    print(str)

reverseString(list("hello"))

