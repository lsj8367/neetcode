class Solution {
    public String longestCommonPrefix(String[] strs) {
        for(int i = 0; i < strs[0].length(); i++) {

            for(String s : strs) {
                // 끝까지 왔거나 현재 문자열의 i번째 첫번째 글자의 i번째 위치와 같지 않다면 이전까지의 string을 반환한다.
                if (i == s.length() || s.charAt(i) != strs[0].charAt(i)) {
                    return s.substring(0, i);
                }

            }
        }

        return strs[0];
    }
}