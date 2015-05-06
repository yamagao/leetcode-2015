public class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    count++;
                    visit(grid, i, j);
                }
            }
        }
        return count;
    }
    
    void visit(char[][] grid, int x, int y){
        if(x > -1 && x < grid.length && y > -1 && y < grid[0].length && grid[x][y] == '1'){
            grid[x][y] = '0';
            visit(grid, x - 1, y);
            visit(grid, x + 1, y);
            visit(grid, x, y + 1);
            visit(grid, x, y - 1);
        }
    }
}