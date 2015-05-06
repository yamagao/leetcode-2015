public class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k % n == 0){
            return;
        }
        k = k % n;
        int temp;
        for(int i = 0; i < (n - k) / 2; i++){
            temp = nums[i];
            nums[i] = nums[n - k - i - 1];
            nums[n - k - i - 1] = temp;
        }
        for(int i = 0; i < k / 2; i++){
            temp = nums[n - i - 1];
            nums[n - i - 1] = nums[n - k + i];
            nums[n - k + i] = temp;
        }
        for(int i = 0; i < n / 2; i++){
            temp = nums[i];
            nums[i] = nums[n - i - 1];
            nums[n - i - 1] = temp;
        }
    }
}