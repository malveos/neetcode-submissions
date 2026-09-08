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
    private Map<Integer, Integer> inorderIndexMap;
    private int[] preorder;
    private int[] inorder;
    private int preIdx;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length != inorder.length || preorder.length == 0) {
            return null;
        }

        this.preorder = preorder;
        this.inorder = inorder;
        this.preIdx = 0;

        // Build map: value -> index in inorder (for this test case only)
        inorderIndexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }

        return build(0, inorder.length);
    }

    // Build tree from inorder[inStart, inEnd)
    private TreeNode build(int inStart, int inEnd) {
        if (inStart == inEnd) {
            return null;
        }

        int rootVal = preorder[preIdx++];
        TreeNode root = new TreeNode(rootVal);

        int mid = inorderIndexMap.get(rootVal);

        // Left subtree: inorder[inStart, mid)
        root.left = build(inStart, mid);
        // Right subtree: inorder[mid+1, inEnd)
        root.right = build(mid + 1, inEnd);

        return root;
    }
}