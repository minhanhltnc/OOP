// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}
    public CharGrid(){}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
    public int charArea(char ch) {
        int row = grid.length;
        if (row == 0) return 0;
        int col = grid[0].length;

        int minRow = row, maxRow = -1;
        int minCol = col, maxCol = -1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == ch) {
                    minRow = Math.min(minRow, i);
                    maxRow = Math.max(maxRow, i);
                    minCol = Math.min(minCol, j);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }

        if (maxRow == -1) return 0;

        int height = maxRow - minRow + 1;//+1 vi bat dau tu i=0
        int width = maxCol - minCol + 1;
        return height * width;
    }



    /**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
    private int countDirection(int i, int j, int di, int dj, char ch) {
        int len = 0;
        while (true) {
            i += di;
            j += dj;
            if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] != ch) break;
            len++;
        }
        return len;
    }


    public int countPlus() {
        int count=0;
        int rows = grid.length;
        if (rows == 0) return 0;
        int cols = grid[0].length;
        for(int i=1;i<rows-1;i++){
            for(int j=1;j<cols-1;j++){
                char center=grid[i][j];
                int up = countDirection(i, j, -1, 0, center);
                int down = countDirection(i, j, 1, 0, center);
                int left = countDirection(i, j, 0, -1, center);
                int right = countDirection(i, j, 0, 1, center);

                if (up >= 1 && up == down && left >= 1 && left == right) {
                    count++;
                }

            }
        }
        return count;
    }
	
}
