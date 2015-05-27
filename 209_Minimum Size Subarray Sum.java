public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int end = 0, start = 0, res = Integer.MAX_VALUE, sum = 0;
        while(end < nums.length){
            while(sum < s && end < nums.length) sum += nums[end++];
            if(sum < s) break;
            while(sum >= s) sum -= nums[start++];
            if(end - start + 1 < res) res = end - start + 1;
        }
        if(res == Integer.MAX_VALUE) return 0;
        return res;
    }
}