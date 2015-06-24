public class Solution {
    public boolean search(int[] nums, int target) {
        int h = 0, t = nums.length - 1;
        while(t - h > 1){
            int m = (h + t) / 2;
            if(nums[h] < nums[m]){
                if(target <= nums[m] && target >= nums[h]){
                    t = m;
                }
                else{
                    h = m + 1;
                }
            }
            else if(nums[h] == nums[m]){
                h++;
            }
            else if(nums[m] == nums[t]){
                t--;
            }
            else{
                if(target <= nums[t] && target >= nums[m]){
                    h = m;
                }
                else{
                    t = m - 1;
                }
            }
        }
        if(nums[h] == target){
            return true;
        }
        if(nums[t] == target){
            return true;
        }
        return false;
    }
}