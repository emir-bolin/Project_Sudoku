public class BruteforceSudokuSolver {
    static int NUMBER_OF_BACKTRACKS = 0;

    public boolean solveSudoku(int[][] board) {
        long startTime = System.nanoTime();

        boolean result = solve(board);

        long endTime = System.nanoTime();
        long solvingTime = endTime - startTime;

        if (result) {
            System.out.println("Sudoku solved in " + solvingTime + " nanoseconds by BruteforceSudokuSolver");
            System.out.println("Number of backtracks was: "+NUMBER_OF_BACKTRACKS);
            printBoard(board);
        } else {
            System.out.println("No solution found.");
        }

        return result;
    }

    public boolean solve(int[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num;
                            if (solve(board)) {
                                return true;
                            }
                            board[row][col] = 0; // If not solved, backtrack
                            increaseNumberOfBacktracks();
                        }
                    }
                    increaseNumberOfBacktracks();
                    return false; // If no valid number can be placed, backtrack
                }
            }
        }
        return true; // Sudoku solved
    }

    private boolean isValid2(int[][] board, int row, int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num || board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == num) {
                return false;
            }
        }
        return true;
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