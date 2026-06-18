class Solution {
    private boolean[][] visited;
    private int row;
    private int col;

    public int islandPerimeter(int[][] grid) {
        row = grid.length;
        col = grid[0].length;
        visited = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    return dfs(grid, i, j);
                }
            }
        }
        return 0;
    }

    private int dfs(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= row
            || j >= col || grid[i][j] == 0) {
            return 1;
        }
        
        if (visited[i][j]) {
            return 0;
        }

        visited[i][j] = true;
        return dfs(grid, i, j + 1) + dfs(grid, i + 1, j)
        + dfs(grid, i, j - 1) + dfs(grid, i - 1, j);
    }
}