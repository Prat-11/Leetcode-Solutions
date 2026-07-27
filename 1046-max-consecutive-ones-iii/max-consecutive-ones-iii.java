class Solution {
    public int longestOnes(int[] nums, int k) {
        int j=0;
        int maxL=0;
        int zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zero++;
            while(zero>k){
                if(nums[j]==0) zero--;
                j++;
            }
            maxL=Math.max(maxL,i-j+1);
        }
        return maxL;
    }
}