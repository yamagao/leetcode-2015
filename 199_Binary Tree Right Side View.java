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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        visit(root, 1, result);
        return result;
    }
    
    void visit(TreeNode n, int level, List<Integer> result){
        if(n == null){
            return;
        }
        if(result.size() < level){
            result.add(n.val);
        }
        visit(n.right, level + 1, result);
        visit(n.left, level + 1, result);
    }
}