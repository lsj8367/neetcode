class Solution {
    int[] dx = new int[]{0, 1, 0, -1};
    int[] dy = new int[]{1, 0, -1, 0};

    static boolean[][] pacificVisited;
    static boolean[][] atlanticVisited;
    
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int row = heights.length;
        int col = heights[0].length;
        pacificVisited = new boolean[row][col];
        atlanticVisited = new boolean[row][col];

        for(int i = 0; i < row; i++) {
            dfs(i, 0, pacificVisited, heights);
            dfs(i, col - 1, atlanticVisited, heights);
        }

        for(int i = 0; i < col; i++) {
            dfs(0, i, pacificVisited, heights);
            dfs(row - 1, i, atlanticVisited, heights);
        }
        List<List<Integer>> answers = new ArrayList<>();

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if (pacificVisited[i][j] && atlanticVisited[i][j]) {
                    answers.add(List.of(i, j));
                }
            }
        }
        return answers;
    }

    private void dfs(int x, int y, boolean[][] visited, int[][] heights) {
        visited[x][y] = true;
        for(int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if (newX >= 0 &&  newX < heights.length && newY >= 0 && newY < heights[0].length) {
                if (!visited[newX][newY] && heights[newX][newY] >= heights[x][y]) {
                    dfs(newX, newY, visited, heights);
                }
            }
        }
    }
}
