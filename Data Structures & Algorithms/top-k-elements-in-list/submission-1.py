class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        dic = defaultdict(int)
        
        for num in nums:
            dic[num] += 1
        
        arr = []
        for key, value in dic.items():
            arr.append([value, key])
        arr.sort()

        answer = []
        while len(answer) < k:
            answer.append(arr.pop()[1])

        return answer