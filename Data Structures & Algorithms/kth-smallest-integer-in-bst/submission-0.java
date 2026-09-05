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
    int ct = 0, val;
    public int kthSmallest(TreeNode root, int k) {
        searh(root, k);
        return val;
    }

    public void searh(TreeNode rt, int k) {
        if (rt == null) return;
        searh(rt.left, k);
        ct ++;
        if (ct == k) val = rt.val;
        searh(rt.right, k);
    }
}
