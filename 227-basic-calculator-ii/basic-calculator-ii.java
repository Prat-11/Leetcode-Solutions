class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char sign = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c))
                num = num * 10 + (c - '0');
                if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) {

                if (sign == '+') stack.push(num);
                if (sign == '-') stack.push(-num);
                if (sign == '*') stack.push(stack.pop() * num);
                if (sign == '/') stack.push(stack.pop() / num);

                sign = c;
                num = 0;
            }
        }

        int ans = 0;
        for (int x : stack)
            ans += x;

        return ans;
    }
}