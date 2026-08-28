/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans = 0;

    public int maxSumBST(TreeNode root) {
        solve(root);
        return ans;
    }

    int[] solve(TreeNode root) {
        if (root == null)
            return new int[]{1, 0, Integer.MAX_VALUE, Integer.MIN_VALUE};

        int[] left = solve(root.left);
        int[] right = solve(root.right);
        if (left[0] == 0 || right[0] == 0)
            return new int[]{0, 0, 0, 0};
        if (root.val <= left[3] || root.val >= right[2])
            return new int[]{0, 0, 0, 0};

        int sum = root.val + left[1] + right[1];

        ans = Math.max(ans, sum);

        int min = Math.min(root.val, left[2]);
        int max = Math.max(root.val, right[3]);

        return new int[]{1, sum, min, max};
    }
}