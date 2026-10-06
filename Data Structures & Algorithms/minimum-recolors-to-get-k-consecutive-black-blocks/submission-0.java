class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0;
        int result = k;
        int countW = 0;

        for(int right = 0; right < blocks.length(); right++) {
            if (blocks.charAt(right) == 'W') {
                countW++;
            }

            if (right - left + 1 > k) {
                if (blocks.charAt(left) == 'W') {
                    countW--;
                }
                left++;
            }

            if (right - left + 1 == k) {
                result = Math.min(result, countW);
            }

        }
        return result;
    }
}