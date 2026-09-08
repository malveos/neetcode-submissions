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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder ==null || inorder == null) return null;
        if (preorder.length == 0 || inorder.length == 0) return null;

        //build root
        TreeNode n = new TreeNode(preorder[0]);
        int md = -1;
        for (int i =0; i< inorder.length; i++) {
            if(inorder[i] == preorder[0]) {
                md= i; break;
            }
        }

        int[] lp = Arrays.copyOfRange(preorder, 1, md + 1);
        int[] li = Arrays.copyOfRange(inorder, 0, md);
        //build left
        n.left = buildTree(lp, li);

        int[] rp = Arrays.copyOfRange(preorder, md + 1, preorder.length);
        int[] ri = Arrays.copyOfRange(inorder, md+1, inorder.length);
        // build right
        n.right = buildTree(rp, ri);


        return n;
    }
}
