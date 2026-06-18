class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> alphabetCount = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            alphabetCount.put(s.charAt(i), alphabetCount.getOrDefault(s.charAt(i), 0) + 1);
        }

        Map<Character, Integer> alphabetCount2 = new HashMap<>();
        for(int i = 0; i < t.length(); i++) {
            alphabetCount2.put(t.charAt(i), alphabetCount2.getOrDefault(t.charAt(i), 0) + 1);
        }

        System.out.println(alphabetCount);
        System.out.println(alphabetCount2);
        return alphabetCount.equals(alphabetCount2);
    }
}
