class Solution {
    private int[] dx = new int[]{1, 0, -1, 0};
    private int[] dy = new int[]{0, 1, 0, -1};
    private static boolean[][] visited;

    public int numIslands(char[][] grid) {
        visited = new boolean[grid.length][grid[0].length];
        int answer = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    dfs(i, j, grid);
                    answer++;
                }
            }
        }
        return answer;
    }

    private void dfs(int x, int y, char[][] grid) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            // 방문 안했고, 좌표가 1이면 dfs 를 쭉 수행한다.
            if (newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length) {
                if (!visited[newX][newY] && grid[newX][newY] == '1') {
                    dfs(newX, newY, grid);
                }
            }
        }
        
    }
}
