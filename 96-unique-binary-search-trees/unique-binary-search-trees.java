class Solution {
    public int numTrees(int n) {
        int[] p = new int[n + 1];

        p[0] = 1;
        p[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int root = 1; root <= i; root++) {
                p[i] += p[root - 1] * p[i - root];
            }
        }

        return p[n];
    }
}