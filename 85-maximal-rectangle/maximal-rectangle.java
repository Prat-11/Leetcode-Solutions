class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix[0].length;
        int[] heights = new int[n];
        int ans = 0;

        for (char[] row : matrix) {

            for (int i = 0; i < n; i++) {
                if (row[i] == '1')
                    heights[i]++;
                else
                    heights[i] = 0;
            }

            ans = Math.max(ans, largestRectangle(heights));
        }

        return ans;
    }

    public int largestRectangle(int[] heights) {
        int n = heights.length;
        int ans = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {
            int curr = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && heights[stack.peek()] > curr) {
                int h = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                ans = Math.max(ans, h * width);
            }

            stack.push(i);
        }

        return ans;
    }
}