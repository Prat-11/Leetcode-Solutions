class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), ans);
        return ans;
    }
    void backtrack(int[] nums, int start, List<Integer> path,
                   List<List<Integer>> ans) {

        if (path.size() >= 2) {
            ans.add(new ArrayList<>(path));
        }

        boolean[] used = new boolean[201];

        for (int i = start; i < nums.length; i++) {
            if (used[nums[i] + 100]) continue;
            if (!path.isEmpty() && nums[i] < path.get(path.size() - 1))
                continue;

            used[nums[i] + 100] = true;
            path.add(nums[i]);

            backtrack(nums, i + 1, path, ans);

            path.remove(path.size() - 1);
        }
    }
}