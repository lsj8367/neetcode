class Solution {
    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> moneyCount = new HashMap<>();
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                moneyCount.put(bills[i], moneyCount.getOrDefault(bills[i], 0) + 1);
            } else if (bills[i] == 10) {
                //10원인 경우
                if (moneyCount.getOrDefault(5, 0) < 1) {
                    return false;
                }
                moneyCount.put(5, moneyCount.get(5) - 1);
                moneyCount.put(10, moneyCount.getOrDefault(10, 0) + 1);
            } else {
                // 20원인 경우
                if (moneyCount.getOrDefault(10, 0) >= 1 && moneyCount.getOrDefault(5, 0) >= 1) {
                    //10원짜리가 1개라도 있는경우

                    moneyCount.put(5, moneyCount.get(5) - 1);
                    moneyCount.put(10, moneyCount.get(10) - 1);
                    moneyCount.put(20, moneyCount.getOrDefault(20, 0) + 1);
                } else {
                    //10원짜리 없는경우
                    if (moneyCount.getOrDefault(5, 0) < 3) {
                        return false;
                    }

                    moneyCount.put(5, moneyCount.get(5) - 3);
                    moneyCount.put(20, moneyCount.getOrDefault(20, 0) + 1);
                }
            }
            
        }

        return true;
    }
}