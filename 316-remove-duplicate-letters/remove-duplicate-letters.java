class Solution {
    public String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        boolean[] used = new boolean[26];

        for (char c : s.toCharArray())
            count[c - 'a']++;

        StringBuilder st = new StringBuilder();

        for (char c : s.toCharArray()) {
            count[c - 'a']--;

            if (used[c - 'a'])
                continue;

            while (st.length() > 0 &&
                   st.charAt(st.length() - 1) > c &&
                   count[st.charAt(st.length() - 1) - 'a'] > 0) {

                used[st.charAt(st.length() - 1) - 'a'] = false;
                st.deleteCharAt(st.length() - 1);
            }

            st.append(c);
            used[c - 'a'] = true;
        }

        return st.toString();
    }
}