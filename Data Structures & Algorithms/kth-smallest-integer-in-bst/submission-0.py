# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        # 전위 순회를 하게되면 이진트리이기 때문에 작은 순서대로 정렬이된 배열을 도출할 수 있다.
        arr = []
        def inOrder(node):
            if not node:
                return
            
            inOrder(node.left)
            arr.append(node.val)
            inOrder(node.right)
        
        inOrder(root)
        return arr[k - 1]