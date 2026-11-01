class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        solve(s, 0, list, ans);
        return ans;
    }
    void solve(String s, int index, List<String> list,
               List<List<String>> ans) {
            if (index == s.length()) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            String sub = s.substring(index, i + 1);
            if (isPalindrome(sub)) {
                list.add(sub);
                solve(s, i + 1, list, ans);
                list.remove(list.size() - 1);
            }
        }
    }
    boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
