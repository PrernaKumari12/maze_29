package lecture_29;

public class maze_blocked {
	public static void main(String[] args) {
		int[][] maze1 = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
		maze(maze1, 0, 0,new boolean[4][4] ,"" );
	}

	public static void maze(int[][] maze, int row, int col, boolean[][] visited, String ans) {
		if (row == -1 || row == maze.length || col == -1 || col == maze[0].length ||  maze[row][col] == 1||visited[row][col]) {
			return;
		}
		
		if (row == maze.length - 1 && col == maze[0].length-1) {
			System.out.println(ans);
			return;
		}
		visited[row][col] = true;
		maze(maze, row - 1, col, visited, ans + "U");
		maze(maze, row + 1, col, visited, ans + "D");
		maze(maze, row, col - 1, visited, ans + "L");
		maze(maze, row, col + 1, visited, ans + "R");
		visited[row][col] = false;
	}

}
