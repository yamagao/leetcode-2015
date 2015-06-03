public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k >= nums.length - 1){
            Arrays.sort(nums);
            for(int i = 0; i < nums.length - 1; i++){
                if(nums[i] == nums[i + 1]) return true;
            }
        }
        int[] cur = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            cur[i] = nums[i];
        }
        for(int i = 0; i < nums.length - k; i++){
            Arrays.sort(cur, i, i + k + 1);
            for(int j = i; j < i + k; j++){
                if(cur[j] == cur[j + 1]) return true;
            }
            for(int t = 0; t < nums.length; t++){
                cur[t] = nums[t];
            }
        }
        return false;
    }
}