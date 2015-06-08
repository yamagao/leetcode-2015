/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        else{
            int dr = maxDepth(root.right);
            int dl = maxDepth(root.left);
            return dr > dl ? 1 + dr : 1 + dl;
        }
    }
}