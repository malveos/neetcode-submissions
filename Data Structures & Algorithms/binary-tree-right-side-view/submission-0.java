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
    List<Integer> ans = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        rightS(root, 0);
        return ans;
    }

    private void rightS(TreeNode n, int dp) {
        if (n == null) return;
        if (ans.size() == dp) {
            ans.add(n.val);
        }
        
        rightS(n.right, dp+1);
        rightS(n.left, dp+1);
    }
}
