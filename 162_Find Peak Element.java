public class Solution {
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        if(len == 1) return 0;
        for(int i = 0; i < len - 1; i++){
            if(nums[i] > nums[i + 1]) return i;
            if(nums[i] == nums[i + 1]){
                while(i + 1 < len && nums[i] >= nums[i + 1]) i++;
            }
        }
        if(nums[len - 1] > nums[len - 2]) return len - 1;
        return -1;
    }
}