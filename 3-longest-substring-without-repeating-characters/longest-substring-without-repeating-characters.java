class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l=0;
        int ans =0;
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))) set.remove(s.charAt(l++));
            set.add(s.charAt(i));
            ans=Math.max(ans,i-l+1);
        }
        return ans;
    }
}