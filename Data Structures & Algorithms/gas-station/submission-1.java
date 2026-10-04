class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        //기름보다 거리가 더 멀면 못감
        if (Arrays.stream(gas).sum() < Arrays.stream(cost).sum()) {
            return -1;
        }

        int total = 0;
        int result = 0;

        for(int i = 0; i < gas.length; i++) {
            total += (gas[i] - cost[i]);
            if (total < 0) {
                total = 0;
                result = i + 1;
            }
        }

        return result;
    }
}
