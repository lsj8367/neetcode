class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numCount = new HashMap<>();
        for(int num : nums) {
            numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        }

        List<int[]> results = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : numCount.entrySet()) {
            results.add(new int[]{entry.getValue(), entry.getKey()});
        }

        results.sort((a, b) -> b[0] - a[0]);

        int[] answers = new int[k];
        for(int i = 0; i < k; i++) {
            answers[i] = results.get(i)[1];
        }
        return answers;
    }
}
