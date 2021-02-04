var reverseString = function (str) {
    var left = 0;
    var right = str.length - 1;
    while (left < right) {
        var tmp = str[left];
        str[left++] = str[right];
        str[right--] = tmp;
    }
    console.log(str);
};
reverseString('hello'.split(""));
