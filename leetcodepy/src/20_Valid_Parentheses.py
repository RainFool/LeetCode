
'''Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.'''
class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = [None]
        paramsMap = {')':'(','}':'{',']':'['}
        for c in s:
            if c in paramsMap and paramsMap[c] == stack[len(stack) - 1]:
                stack.pop()
            else:
                stack.append(c)
        return len(stack) == 1

if __name__ == "__main__":
    solution = Solution()
    print(solution.isValid("{([])}"))
