'''
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.
'''
class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        numerals = { "M": 1000, "D": 500, "C": 100, "L": 50, "X": 10, "V": 5, "I": 1 }
        sum = 0
        max = 1
        # for in xrange()


if __name__ == "__main__":
    solution = Solution()
    solution.romanToInt("I")
    solution.romanToInt("V")
    solution.romanToInt("X")
    solution.romanToInt("L")
    solution.romanToInt("C")
    solution.romanToInt("D")
    solution.romanToInt("M")
