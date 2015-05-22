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
    public boolean isBalanced(TreeNode root) {
        if(height(root) != -1){
            return true;
        }
        return false;
    }
    
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        int lefth = height(root.left);
        if(lefth == -1){
            return -1;
        }
        int righth = height(root.right);
        if(righth == -1){
            return -1;
        }
        if(lefth - righth > 1 || lefth - righth < -1){
            return -1;
        }
        return Math.max(lefth, righth) + 1;
    }
}