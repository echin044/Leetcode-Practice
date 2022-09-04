class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length, m=grid[0].length,islands = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    islands++; //found an island
                    grid[i][j] = '0'; // marked visited
                    markVisited(grid,i,j); //function to mark all connected nodes
                }
            }
        }
        return islands;
    }
    public void markVisited(char[][] grid,int i,int j){
        if(i>0){
            if(grid[i-1][j]=='1'){
                grid[i-1][j] = '0';
                markVisited(grid,i-1,j);
            }
        }
        if(j>0){
            if(grid[i][j-1]=='1'){
                grid[i][j-1] = '0';
                markVisited(grid,i,j-1);
            }
        }        
        if(i<grid.length-1){
            if(grid[i+1][j]=='1'){
                grid[i+1][j] = '0';
                markVisited(grid,i+1,j);
            }
        }
        if(j<grid[0].length-1){
            if(grid[i][j+1]=='1'){
                grid[i][j+1] = '0';
                markVisited(grid,i,j+1);
            }
        }
    }
}
    
