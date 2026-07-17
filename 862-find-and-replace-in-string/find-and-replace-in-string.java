class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        int[] match = new int[n];

        for (int i = 0; i < n; i++) match[i] = -1;
        for (int i = 0; i < indices.length; i++) {
            if (s.startsWith(sources[i], indices[i])) {
                match[indices[i]] = i;
            }
        }
        for (int i = 0; i < n;) {
            if (match[i] >= 0) {
                ans.append(targets[match[i]]);
                i += sources[match[i]].length();
            } else {
                ans.append(s.charAt(i));
                i++;
            }
        }
        return ans.toString();
    }
}