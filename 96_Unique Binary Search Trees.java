public class Solution {
    public int numTrees(int n) {
        int[] res = new int[n + 1];
        res[0] = 1;
        for(int i = 1; i < n + 1; i++){
            for(int j = 0; j < i / 2; j++){
                res[i] += res[j] * res[i - 1 - j] * 2; 
            }
            if(i % 2 == 1){
                res[i] += res[i / 2] * res[i / 2];
            }
        }
        return res[n];
    }
}