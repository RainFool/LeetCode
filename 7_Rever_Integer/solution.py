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
        while x != 0:
            result = result * 10 + x % 10
            x = x / 10
        print result
        return result

if __name__ == "__main__":
    solution = Solution()
    solution.reverse(1000)
    solution.reverse(123456)
    solution.reverse(-1)
    solution.reverse(-123456)
    solution.reverse(0)
    solution.reverse(1)
