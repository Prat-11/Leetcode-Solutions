class Solution {
    int[] original;
    int[] nums;
    Random rand = new Random();

    public Solution(int[] nums) {
        this.original = nums.clone();
        this.nums = nums.clone();
    }

    public int[] reset() {
        return original.clone();
    }

    public int[] shuffle() {
        for (int i = nums.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        return nums;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */