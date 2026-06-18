class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        answers = []

        dic = {}
        for s in strs:
            key = [0] * 26
            for c in s:
                key[ord(c) - ord('a')] += 1
            
            keyStr = str(key)
            if keyStr in dic:
                dic[keyStr].append(s)
            else:
                dic[keyStr] = []
                dic[keyStr].append(s)

        for key, value in dic.items():
            answers.append(value)
        
        return answers