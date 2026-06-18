class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        numSet = set(nums)
        index = 0
        for val in numSet:
            if val - 1 not in numSet:
                length = 1

                while (val + length) in numSet:
                    length += 1
                index = max(index, length)

        return index
            