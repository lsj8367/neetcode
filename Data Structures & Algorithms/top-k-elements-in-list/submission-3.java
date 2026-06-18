class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numCount = new HashMap<>();
        
        for(int num : nums) {
            numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        }

        List<int[]> answers = new ArrayList<>();

        for (Integer key: numCount.keySet()) {
            answers.add(new int[]{numCount.get(key), key});
        }

        // 값 내림차순으로 정답 정렬
        answers.sort((a, b) -> b[0] - a[0]);

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = answers.get(i)[1];
        }

        return res;
    }
}
