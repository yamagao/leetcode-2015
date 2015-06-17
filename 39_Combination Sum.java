public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> com = new ArrayList<Integer>();
        Arrays.sort(candidates);
        doSum(candidates, target, res, com, 0);
        return res;
    }
    
    void doSum(int[] candidates, int target, List res, List com, int start){
        if(target == 0) res.add(new ArrayList(com));
        for(int i = start; i < candidates.length && candidates[i] <= target; i++){
            com.add(candidates[i]);
            doSum(candidates, target - candidates[i], res, com, i);
            com.remove(com.size() - 1);
        }
    }
}