
class RecursionPrinciple:
    def printReverse(self, str):
        def helper(index, str):
            if (index >= len(str)):
                return
            helper(index + 1, str)
            print(str[index])
        helper(0, str)

RecursionPrinciple().printReverse(list("abc"))
