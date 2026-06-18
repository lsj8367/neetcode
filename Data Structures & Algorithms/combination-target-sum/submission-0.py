class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        res = []

        def dfs(i, cur, total):
            if total == target:
                res.append(cur.copy())
                return
            if i >= len(nums) or total > target:
                return
            
            cur.append(nums[i])
            # 현재 값에 현재 배열 index를 누적하여 더하다가 위에서 target보다 커지면 끝
            dfs(i, cur, total + nums[i])
            # target보다 커진 상태까지 배열이 들어갔으니 직전 데이터를 pop()
            cur.pop()
            # 그 다음에 해당하는 인덱스에 대해 계속해서 반복한다
            dfs(i + 1, cur, total)
            
        
        dfs(0, [], 0)
        return res
            