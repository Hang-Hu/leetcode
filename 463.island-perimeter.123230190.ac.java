/*
// four sides solution
class Solution {
    public int islandPerimeter(int[][] grid) {
        int sum=0;
        int width = grid[0].length;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<width; j++){
                if(grid[i][j]==1){
                    sum+=(4-landNum(grid, i, j));
                }
            }
        }
        return sum;
    }
    private int landNum(int[][] grid, int i, int j){
        int height=grid.length;
        int width=grid[0].length;
        int a = i-1 >= 0        ? grid[i-1][j] : 0;
        int b = i+1 < height    ? grid[i+1][j] : 0;
        int c = j+1 < width     ? grid[i][j+1] : 0;
        int d = j-1 >= 0        ? grid[i][j-1] : 0;
        return a+b+c+d;
    }
}
*/
// two sides solution, use 2*num(right, up) to replace 1*num(up, right, down, left)
// It's my ceiling, and it's your floor
// It's my right, and it's your left
class Solution {
    public int islandPerimeter(int[][] grid) {
        int sum=0;
        int width = grid[0].length;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<width; j++){
                if(grid[i][j]==1){
                    sum+=4;
                    sum-=2*(j+1<width?grid[i][j+1]:0);
                    sum-=2*(i-1>=0?grid[i-1][j]:0);
                }
            }
        }
        return sum;
    }
}
