 class Solution {
    public int islandPerimeter(int[][] grid) {
        int line = grid.length;
        int row = grid[0].length;
        int islands = 0, neighbours = 0;
        for(int i=0;i<line;i++){
            for(int j=0;j<row;j++){
                if(grid[i][j]==1){
                    islands++; 
                    if (i < line - 1 && grid[i + 1][j] == 1) neighbours++;
                    if (j < row - 1 && grid[i][j + 1] == 1) neighbours++; 
                }
            }
        }
        return islands * 4 - neighbours * 2;
    }
}