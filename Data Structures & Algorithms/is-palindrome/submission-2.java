class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while(left < right && !alphaNum(s.charAt(left))) {
                left++;
            }

            while (left < right && !alphaNum(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;        
    }

    private boolean alphaNum(char c) {
        if (c >= 'A' && c <= 'Z') {
            return true;
        }

        if ('a' <= c && c <= 'z') {
            return true;
        }

        if ('0' <= c && c <= '9') {
            return true;
        }

        return false;
    }
}
