import re

class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = re.sub(r'[^A-Za-z0-9]', '', s)
        s = s.replace(' ', '')
        s = s.lower()

        reverseS = ''
        
        for i in range(len(s) - 1, -1, -1):
            reverseS += s[i]
        return s == reverseS