public class Solution {
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        if(len == 0) return -1;
        if(len == 1) return 0;
        if(len == 2) return nums[0] > nums[1] ? 0 : 1;
        if(nums[0] > nums[1]) return 0;
        for(int i = 1; i < len - 1; i++){
            if(nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) return i;
        }
        if(nums[len - 1] > nums[len - 2]) return len - 1;
        return -1;
    }
}