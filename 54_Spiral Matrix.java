public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new LinkedList();
        int height = matrix.length;
        if(height == 0) return res;
        int width = matrix[0].length;
        int cur = 0;
        int i, j;
        while(width - cur * 2 > 0 && height - cur * 2 > 0){
            for(i = cur, j = cur; j < width - cur; j++){
                res.add(matrix[i][j]);
            }
            for(i = cur + 1, j = width - 1 - cur; i < height - cur; i++){
                res.add(matrix[i][j]);
            }
            if(height - 1 - cur != cur){
                for(i = height - 1 - cur, j = width - 2 - cur; j > cur - 1; j--){
                    res.add(matrix[i][j]);
                }
            }
            if(width - 1 - cur != cur){
                for(i = height - 2 - cur, j = cur; i > cur; i--){
                    res.add(matrix[i][j]);
                }
            }
            cur++;
        }
        return res;
    }
}