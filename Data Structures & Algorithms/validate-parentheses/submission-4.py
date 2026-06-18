class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        dic = {
            '}': '{',
            ']': '[',
            ')': '('
        }

        for char in s:
            if char == '[' or char == '{' or char == '(':
                stack.append(char)
            else:
                if not stack:
                    return False                
                bracket = stack.pop()

                if dic[char] != bracket:
                    return False
                

        return len(stack) == 0