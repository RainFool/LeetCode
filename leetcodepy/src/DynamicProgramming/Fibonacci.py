#coding:utf-8
'''
练习动态规划在斐波那契数列上的应用
'''


class Solution(object):
    def fibonacci(self, root):
        memo = {}
        if root in memo.keys():
            return memo[root]
        if root < 0:
            print "root num is%d" % root
            return 0
        elif root in (0,1):
            memo[root] = root
            return root
        else:
            value = self.fibonacci(root - 1) + self.fibonacci(root -2)
            memo[root] = value
            return value



if __name__ == "__main__":
    solution = Solution()
    print(solution.fibonacci(-1))
    print(solution.fibonacci(1))
    print(solution.fibonacci(5))
    print(solution.fibonacci(8))
