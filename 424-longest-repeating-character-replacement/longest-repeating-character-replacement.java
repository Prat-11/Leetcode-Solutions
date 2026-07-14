class Solution {
    public int characterReplacement(String s, int k) {
       int[] count = new int[26] ;
       int l = 0;
       int max=0;
       int ans=0;
       for(int i=0;i<s.length();i++){
        max = Math.max(max,++count[s.charAt(i)-'A']);
        while(i-l+1-max>k) count[s.charAt(l++)-'A']--;
        ans=Math.max(ans,i-l+1);
       }
       return ans;
    }
}