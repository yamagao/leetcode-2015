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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<List<Integer>>();
        }
        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> element = new ArrayList<Integer>();
        list.add(root);
        int count = 1;
        while(!list.isEmpty()){
            TreeNode cur = list.remove(0);
            element.add(cur.val);
            count--;
            if(cur.left != null){
                list.add(cur.left);
            }
            if(cur.right != null){
                list.add(cur.right);
            }
            if(count == 0){
                res.add(element);
                count = list.size();
                element = new ArrayList<Integer>();
            }
        }
        return res;
    }
}