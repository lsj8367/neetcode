class Solution {
    public int calPoints(String[] operations) {
        // + 는 이전의 나온 2개의 점수 더하고 넣음
        // D 이전 점수의 2배 하고 점수에 넣음
        // C 는 가장 최근 값을 제거함
        Stack<Integer> stack = new Stack<>();
        
        for(String operation : operations) {
            if (operation.equals("+")) {
                int top = stack.pop();
                int next = stack.peek() + top;
                stack.push(top);
                stack.push(next);
            } else if (operation.equals("D")) {
                stack.push(2 * stack.peek());
            } else if (operation.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(operation));
            }
        }
        
        int sum = 0;
        for (int score : stack) {
            sum += score;
        }
        return sum;
    }
}