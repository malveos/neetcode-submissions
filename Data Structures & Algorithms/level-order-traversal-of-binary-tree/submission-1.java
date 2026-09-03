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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> qu= new LinkedList<>();
        qu.offer(root);

        while(!qu.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            for (int i= qu.size(); i>0; i--) {
                TreeNode tn = qu.poll();
                if (tn != null) {
                    level.add(tn.val);
                    qu.offer(tn.left);
                    qu.offer(tn.right);
                }
            }
            if (level.size() > 0) 
                ans.add(level);
        }


        return ans;
    }
}
