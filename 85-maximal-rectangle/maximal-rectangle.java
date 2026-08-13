class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[] h = new int[n];
        int ans = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                h[j] = matrix[i][j] == '1' ? h[j] + 1 : 0;

            Stack<Integer> st = new Stack<>();

            for (int j = 0; j <= n; j++) {
                int cur = j == n ? 0 : h[j];

                while (!st.isEmpty() && h[st.peek()] > cur) {
                    int height = h[st.pop()];
                    int width = st.isEmpty() ? j : j - st.peek() - 1;
                    ans = Math.max(ans, height * width);
                }

                st.push(j);
            }
        }

        return ans;
    }
}