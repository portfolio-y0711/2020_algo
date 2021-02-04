var RecursionPrinciple = function () {
    var printReverse = function (str) {
        var helper = function (index, str) {
            if (index >= str.length) {
                return;
            }
            helper(index + 1, str);
            console.log(str[index]);
        };
        helper(0, str);
    };
    return {
        printReverse: printReverse
    };
};
RecursionPrinciple().printReverse("abc".split(""));
