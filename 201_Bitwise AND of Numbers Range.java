public class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        if(m == n){
            return m;
        }
        int count = 0;
        while(m != 0 && n != 0){
            m = m >> 1;
            n = n >> 1;
            count++;
            if(m == n){
                return m << count;
            }
        }
        return 0;
    }
}