class Solution {
    public int minimumDeletions(String s) {
        int b = 0;
        int ans = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'b') {
                b++;
            } else {
                ans = Math.min(ans + 1, b);
            }
        }

        return ans;
    }
}