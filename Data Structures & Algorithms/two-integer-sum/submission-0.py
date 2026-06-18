class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dic = {}

        for idx, val in enumerate(nums):
            diff = target - val
            if diff in dic:
                return [dic[diff], idx]
            dic[val] = idx 

        return []