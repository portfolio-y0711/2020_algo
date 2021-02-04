const reverseString = (str: string[]) => {
    let left = 0;
    let right = str.length - 1;
    while (left < right) {
        let tmp = str[left];
        str[left++] = str[right];
        str[right--] = tmp;
    }
    console.log(str);
}

reverseString('hello'.split(""))

