class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String s : strs) {
            char[] chaArr = s.toCharArray();
            Arrays.sort(chaArr);
            String key = new String(chaArr);
            groups.putIfAbsent(key, new ArrayList<>());
            groups.get(key).add(s);
        }

        List<List<String>> results = new ArrayList<>();
        for (List<String> g : groups.values()) {
            results.add(g);
        }
        return results;
    }
    
}