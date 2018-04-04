'''
Write a function to find the longest common prefix string amongst an array of strings.
'''


class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if len(strs) <= 0:
            return ''

        result = ''
        minLen = len(min(strs))
        for i in range(minLen, 0, -1):

            minT = min(strs)[0:i]
            allEquals = True
            # print 'minT:%s' % minT
            for s in strs:
                t = s[0:i]
                # print 'minT %s,t:t %s' % (minT,t)
                if minT != t:
                    allEquals = False
                    break
            if (allEquals):
                result = minT
                break
        return result


if __name__ == "__main__":
    solution = Solution()
    list = ['qwer', 'qwertyuio', 'qwertysdfg']
    print solution.longestCommonPrefix(list)

    list = ['a','b']
    print solution.longestCommonPrefix(list)
    list = ['aa','ab']
    print solution.longestCommonPrefix(list)
    list = []
    print solution.longestCommonPrefix(list)
