public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[nums.length - 1];
        for(int i = 0; i < nums.length - 2; i++){
            int start = i + 1, end = nums.length - 1;
            while(start < end){
                if(Math.abs(nums[i] + nums[start] + nums[end] - target) < Math.abs(res - target)){
                    res = nums[i] + nums[start] + nums[end];
                }
                if(nums[i] + nums[start] + nums[end] > target){
                    end--;
                }
                else{
                    start++;
                }
            }
        }
        return res;
    }
}