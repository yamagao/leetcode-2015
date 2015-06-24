public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 3){
            return nums.length;
        }
        int pos = 0;
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i + 1] != nums[i]){
                if(count > 0){
                    nums[pos + 1] = nums[pos++]; 
                }
                nums[++pos] = nums[i + 1];
                count = 0;
            }
            else{
                count++;
            }
        }
        if(count > 0){
            nums[pos + 1] = nums[pos++];
        }
        return pos + 1;
    }
}