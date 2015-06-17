public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> com = new ArrayList<Integer>();
        int[] candidates = {1,2,3,4,5,6,7,8,9};
        doSum(candidates, k, n, res, com, 0);
        return res;
    }
    
    void doSum(int[] candidates, int k, int target, List res, List com, int start){
        if(target == 0 && k == 0) res.add(new ArrayList(com));
        for(int i = start; i < candidates.length && candidates[i] <= target; i++){
                com.add(candidates[i]);
                doSum(candidates, k - 1, target - candidates[i], res, com, i + 1);
                com.remove(com.size() - 1);
        }
    }
}