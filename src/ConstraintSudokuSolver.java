import java.util.ArrayList;
import java.util.List;

public class ConstraintSudokuSolver {
    static int NUMBER_OF_BACKTRACKS = 0;
    public boolean solveSudoku(int[][] board) {
        long startTime = System.nanoTime();

        List<int[]> emptyCells = findEmptyCells(board);
        boolean result = solve(board, emptyCells, 0);

        long endTime = System.nanoTime();
        long solvingTime = endTime - startTime;

        if (result) {
            System.out.println("Sudoku solved in " + solvingTime + " nanoseconds by ConstraintSudokuSolver");
            System.out.println("Number of backtracks was: "+NUMBER_OF_BACKTRACKS);
            printBoard(board);
        } else {
            System.out.println("No solution found.");
        }

        return result;
    }

    private boolean solve(int[][] board, List<int[]> emptyCells, int index) {
        if (index == emptyCells.size()) {
            // All variables assigned, puzzle solved.
            return true;
        }

        int[] cell = emptyCells.get(index);
        int row = cell[0];
        int col = cell[1];

        for (int num = 1; num <= 9; num++) {
            if (isValid(board, row, col, num)) {
                board[row][col] = num;
                if (solve(board, emptyCells, index + 1)) {
                    return true;
                }
                board[row][col] = 0; // Backtrack
                increaseNumberOfBacktracks();
            }
        }
        increaseNumberOfBacktracks();
        return false; // No valid assignment found, backtrack.
    }

    private boolean isValid(int[][] board, int row, int col, int num) {
        // Check the current row for num
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) {
                return false; // num already exists in the current row
            }
        }

        // Check the current column for num
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return false; // num already exists in the current column
            }
        }

        // Check the current 3x3 subgrid (box) for num
        int boxStartRow = row - row % 3;
        int boxStartCol = col - col % 3;
        for (int i = boxStartRow; i < boxStartRow + 3; i++) {
            for (int j = boxStartCol; j < boxStartCol + 3; j++) {
                if (board[i][j] == num) {
                    return false; // num already exists in the current subgrid
                }
            }
        }

        // If num is not found in the current row, column, or subgrid, it's a valid placement.
        return true;
    }

    private List<int[]> findEmptyCells(int[][] board) {
        List<int[]> emptyCells = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0) {
                    emptyCells.add(new int[] { i, j });
                }
            }
        }
        return emptyCells;
    }
    private static void printBoard(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void increaseNumberOfBacktracks() {
        NUMBER_OF_BACKTRACKS++;
    }
}



