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
    public boolean isValidBST(TreeNode root) {
        return isV(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isV(TreeNode tn, long leftMax, long rightMin) {
        if (tn == null)
            return true;
        
        if (leftMax >= tn.val) return false;
        if (rightMin <= tn.val) return false;

        return isV(tn.left, leftMax, tn.val) && isV(tn.right, tn.val, rightMin);
    }
}
