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
    int index = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, inorder.length - 1);
    }

    TreeNode build(int[] pre, int[] in, int l, int r) {
        if (l > r)
            return null;

        TreeNode root = new TreeNode(pre[index++]);

        int i = l;
        while (in[i] != root.val)
            i++;

        root.left = build(pre, in, l, i - 1);
        root.right = build(pre, in, i + 1, r);

        return root;
    }
}