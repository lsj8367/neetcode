class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            int first;
            int second;
            switch (token) {
                case "+":
                    first = stack.pop();
                    second = stack.pop();
                    stack.push(second + first);
                    break;
                case "-":
                    first = stack.pop();
                    second = stack.pop();
                    stack.push(second - first);
                    break;
                case "*":
                    first = stack.pop();
                    second = stack.pop();
                    stack.push(second * first);
                    break;
                case "/":
                    first = stack.pop();
                    second = stack.pop();
                    stack.push(second / first);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
                    break;
            }
        }

        return stack.pop();
    }
}
