public class Solution {
    public int[][] generateMatrix(int n) {
        int top = 0, down = n - 1, right = n - 1, left = 0, count = 1;
        int[][] res = new int[n][n];
        while(count <= n * n){
            for(int i = left; i <= right; i++){
                res[top][i] = count++;
            }
            top++;
            for(int i = top; i <= down; i++){
                res[i][right] = count++;
            }
            right--;
            for(int i = right; i >= left; i--){
                res[down][i] = count++;
            }
            down--;
            for(int i = down; i >= top; i--){
                res[i][left] = count++;
            }
            left++;
        }
        return res;
    }
}