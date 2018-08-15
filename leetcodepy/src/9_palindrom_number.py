'''Determine whether an integer is a palindrome. Do this without extra space.
'''


class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        a = x
        r = 0
        if x < 0:
            return False
        while a > 0:
            r = r * 10 + a % 10
            a = a / 10
        print(x == r)
        return x == r


if __name__ == "__main__":
    solution = Solution()
    solution.isPalindrome(1000)
    solution.isPalindrome(123456)
    solution.isPalindrome(-1)
    solution.isPalindrome(-123456)
    solution.isPalindrome(0)
    solution.isPalindrome(1534236469)
