class Solution {
    public int addMinimum(String word) {
        int ans = 0;
        int i = 0;

        while (i < word.length()) {
            char ch = word.charAt(i);

            if (ch == 'a') {
                i++;
            } else {
                ans++;
            }

            if (i >= word.length() || word.charAt(i) != 'b') {
                ans++;
            } else {
                i++;
            }

            if (i >= word.length() || word.charAt(i) != 'c') {
                ans++;
            } else {
                i++;
            }
        }

        return ans;
    }
}