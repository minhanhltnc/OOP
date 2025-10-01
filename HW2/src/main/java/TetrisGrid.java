//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
    private boolean[][] grid;
    /**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public TetrisGrid(boolean[][] grid) {
        this.grid=grid;
	}
	
	
	/**
	 * Does row-clearing on the grid (see handout).
	 */
    private boolean isFullRow(boolean[] row) {
        for (boolean cell : row) {
            if (!cell) return false;
        }
        return true;
    }

    public void clearRows() {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] newGrid = new boolean[rows][cols];
        int newRow = rows - 1;

        for (int i = rows - 1; i >= 0; i--) {
            if (!isFullRow(grid[i])) {
                for (int j = 0; j < cols; j++) {
                    newGrid[newRow][j] = grid[i][j];
                }
                newRow--;
            }
        }

        grid = newGrid;


    }
	
	/**
	 * Returns the internal 2d grid array.
	 * @return 2d grid array
	 */
	boolean[][] getGrid() {
		return grid; // YOUR CODE HERE
	}
}
