
const RecursionPrinciple = () => {
    const printReverse = (str: Array<any>) => {
        const helper = (index: number, str: Array<any>) => {
           if (index >= str.length) {
               return;
           }
           helper(index + 1, str);
           console.log(str[index]);
        }
        helper(0, str);
    }
    return {
        printReverse
    }
};

RecursionPrinciple().printReverse("abc".split(""))
