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
    public List<TreeNode> generateTrees(int n) {
        return generateTrees(1, n);
    }
    
    List<TreeNode> generateTrees(int s, int e){
        List<TreeNode> res = new ArrayList<TreeNode>();
        if(s > e){
            res.add(null);
            return res;
        }
        
        for(int root = s; root <= e; root++){
            List<TreeNode> left = generateTrees(s, root - 1);
            List<TreeNode> right = generateTrees(root + 1, e);
            for(TreeNode l : left){
                for(TreeNode r : right){
                    TreeNode rootNode = new TreeNode(root);
                    rootNode.left = l;
                    rootNode.right = r;
                    res.add(rootNode);
                }
            }
        }
        return res;
    }
}