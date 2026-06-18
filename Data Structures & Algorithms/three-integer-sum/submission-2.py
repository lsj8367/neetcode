class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        answer = []
        nums.sort()

        for index, val in enumerate(nums):
            if val > 0:
                break
            
            if index > 0 and val == nums[index - 1]:
                continue
            
            left, right = index + 1, len(nums) - 1

            while left < right:
                threeSum = val + nums[left] + nums[right]
                if threeSum > 0:
                    right -= 1
                elif threeSum < 0:
                    left += 1
                else:
                    answer.append([val, nums[left], nums[right]])
                    left += 1
                    right -= 1
                    while nums[left] == nums[left - 1] and left < right:
                        left += 1
        return answer