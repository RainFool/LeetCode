'''
Given a 32-bit signed integer, reverse digits of an integer.

'''


class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        result = 0
        singn = 1 if x > 0 else -1
        x = abs(x)
        while x != 0:
            result = result * 10 + x % 10
            x = x / 10
        if result > 2147483647:
            return 0
        else:
            result = result * singn
        print result
        return result

if __name__ == "__main__":
    solution = Solution()
    solution.reverse(1000)
    solution.reverse(123456)
    solution.reverse(-1)
    solution.reverse(-123456)
    solution.reverse(0)
    solution.reverse(1534236469)
