public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2){
            return nums.length;
        }
        int pos = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i + 1] != nums[i]){
                nums[++pos] = nums[i + 1];
            }
        }
        return pos + 1;
    }
}