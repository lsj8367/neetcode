class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        result = 0
        charSet = set(s)

        for c in charSet:
            count = 0
            left = 0

            for right in range(len(s)):
                if s[right] == c:
                    count += 1
                
                while (right - left + 1) - count > k:
                    if s[left] == c:
                        count -= 1
                    left += 1
                result = max(result, right - left + 1)
        return result
