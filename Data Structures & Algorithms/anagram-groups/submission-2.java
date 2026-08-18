class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> results = new HashMap<>();

        for(String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = Arrays.toString(arr);
            results.putIfAbsent(key, new ArrayList<>());
            results.get(key).add(str);
        }

        return new ArrayList<>(results.values());
    }
}
