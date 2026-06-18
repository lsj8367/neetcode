# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:
        if not preorder or not inorder:
            return None
        
        # 전위순회 0번째가 항상 루트 시작점
        # preorder 9
        root = TreeNode(preorder[0])
        mid = inorder.index(preorder[0])
        # 전위순회에서는 왼쪽에선 나를 제외한 mid 전까지의 값이 필요하기 때문에 + 1을 해준다
        # 중위순회에서는 ^ 로 순회하기 때문에 기준점인 mid 이후 오른쪽의 값들만 위치해서 넣어줄 수 있도록 한다
        root.left = self.buildTree(preorder[1 : mid + 1], inorder[:mid])
        root.right = self.buildTree(preorder[mid + 1:], inorder[mid + 1 :])
        return root