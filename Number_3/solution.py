'''Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
'''


def fun(s):

    index = 0
    max = 1

    for i in range(len(s)):
         print(s[i])


         for j in range(index,i -1):
             if s[i] == s[j]:
                 index = j + 1
                 print(index)
                 break;
             else :
                 if max < i - j:
                     max = i - j;
                 print("max:${max}",max)


    return max


fun("bbbbb")
