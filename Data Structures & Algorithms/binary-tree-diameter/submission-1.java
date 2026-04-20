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
    public int diameterOfBinaryTree(TreeNode root) {
        if (root ==null)
         return 0;
        int l = maxH(root.left);
        int r = maxH(root.right);
        int d = l + r;
        
        int child =  Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right));

        return Math.max(child, d);
    }

    public int maxH(TreeNode n) {
        if (n == null) return 0;
        return 1 + Math.max(maxH(n.left), maxH(n.right));
    }
}
