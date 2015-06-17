public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> com = new ArrayList<Integer>();
        Arrays.sort(candidates);
        doSum(candidates, target, res, com, 0);
        return res;
    }
    
    void doSum(int[] candidates, int target, List res, List com, int start){
        if(target == 0) res.add(new ArrayList(com));
        for(int i = start; i < candidates.length && candidates[i] <= target; i++){
            if(i == start || candidates[i] != candidates[i - 1]){
                com.add(candidates[i]);
                doSum(candidates, target - candidates[i], res, com, i + 1);
                com.remove(com.size() - 1);
            }
        }
    }
}