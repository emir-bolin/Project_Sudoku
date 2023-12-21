public class Main {
    public static void main(String[] args) {

        int[][] sudoku17 = {
                {6, 0, 0, 0, 0, 0, 5, 0, 0},
                {6, 0, 0, 0, 0, 0, 7, 0, 6},
                {3, 0, 0, 8, 0, 0, 0, 0, 0},
                {0, 0, 8, 4, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 7, 0, 3, 0},
                {5, 0, 0, 0, 0, 0, 0, 0, 9},
                {0, 4, 2, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 5, 6, 0, 0, 0}
        };
        int[][] sudoku18 = {
                {0, 2, 0, 0, 0, 4, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 6, 0, 0},
                {0, 0, 4, 0, 0, 0, 9, 0, 0},
                {6, 0, 0, 0, 0, 0, 0, 0, 0},
                {5, 0, 0, 0, 0, 0, 0, 0, 7},
                {0, 0, 0, 0, 7, 1, 0, 4, 0},
                {0, 0, 0, 9, 0, 0, 0, 0, 0},
                {0, 5, 1, 0, 0, 0, 0, 2, 0},
                {0, 0, 0, 8, 6, 0, 0, 3, 0}
        };
        int[][] sudoku19 = {
                {0, 0, 0, 0, 0, 0, 0, 8, 0},
                {1, 0, 0, 4, 0, 0, 0, 7, 0},
                {0, 0, 2, 0, 0, 0, 1, 0, 0},
                {7, 0, 0, 0, 0, 0, 5, 4, 0},
                {3, 0, 0, 0, 2, 6, 0, 0, 0},
                {0, 0, 0, 0, 9, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 8, 0, 1, 0, 0, 0},
                {0, 0, 9, 0, 4, 0, 6, 0, 2}
        };
        int[][] sudoku20 = {
                {6, 0, 0, 0, 0, 3, 9, 1, 0},
                {8, 0, 0, 0, 0, 0, 0, 0, 0},
                {7, 0, 0, 0, 4, 0, 0, 0, 0},
                {0, 9, 0, 0, 0, 5, 1, 0, 0},
                {0, 3, 6, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 8, 0, 0, 6, 0},
                {0, 0, 0, 0, 0, 0, 0, 8, 7},
                {0, 2, 0, 0, 0, 9, 0, 0, 0},
                {0, 0, 0, 2, 0, 0, 0, 4, 0}
        };
        int[][] sudoku21 = {
                {0, 0, 0, 2, 0, 0, 0, 9, 0},
                {0, 0, 6, 0, 0, 0, 0, 5, 0},
                {0, 0, 3, 0, 0, 4, 0, 0, 0},
                {2, 0, 1, 0, 0, 0, 6, 0, 0},
                {0, 0, 0, 5, 1, 0, 0, 0, 0},
                {0, 0, 0, 9, 0, 0, 7, 0, 0},
                {9, 3, 0, 0, 0, 0, 0, 0, 0},
                {0, 4, 0, 0, 0, 3, 0, 7, 0},
                {0, 0, 0, 0, 9, 6, 3, 0, 0}
        };
        int[][] sudoku22 = {
                {0, 0, 0, 0, 8, 0, 0, 0, 1},
                {9, 0, 0, 4, 2, 0, 3, 0, 0},
                {0, 0, 0, 0, 0, 0, 7, 0, 8},
                {2, 0, 0, 0, 0, 0, 6, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 9, 0, 0, 8, 0, 1, 3},
                {0, 3, 8, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 6, 0, 0, 2, 0},
                {6, 2, 1, 0, 0, 0, 0, 0, 0}
        };
        int[][] sudoku23 = {
                {2, 0, 0, 9, 5, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 6, 7, 0, 0, 0},
                {0, 0, 1, 4, 0, 6, 3, 0, 0},
                {0, 0, 0, 0, 3, 8, 0, 0, 0},
                {0, 6, 0, 0, 1, 0, 0, 0, 7},
                {0, 8, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 3, 0, 9, 5, 1, 0},
                {0, 7, 0, 0, 2, 0, 0, 0, 0}
        };
        int[][] sudoku24 = {
                {0, 0, 0, 0, 2, 6, 0, 0, 0},
                {0, 0, 8, 0, 3, 5, 9, 0, 0},
                {0, 0, 7, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 5, 0, 3, 2, 0, 0},
                {0, 2, 0, 4, 0, 7, 0, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 9, 0},
                {0, 0, 0, 0, 0, 0, 0, 4, 7},
                {6, 0, 0, 0, 5, 9, 0, 0, 2},
                {0, 0, 0, 2, 0, 0, 0, 8, 0}
        };
        int[][] sudoku25 = {
                {9, 0, 0, 0, 0, 1, 0, 5, 0},
                {0, 6, 0, 0, 0, 5, 0, 0, 0},
                {2, 0, 0, 0, 0, 4, 7, 0, 0},
                {0, 0, 4, 0, 6, 3, 0, 0, 0},
                {0, 0, 2, 0, 7, 9, 0, 0, 0},
                {5, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 1, 0, 0, 7, 9},
                {0, 7, 5, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 5, 0, 6, 2, 3}
        };
        int[][] sudoku26 = {
                {4, 0, 0, 0, 0, 0, 0, 0, 0},
                {2, 0, 8, 0, 0, 5, 0, 0, 3},
                {7, 0, 6, 0, 0, 9, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 4, 0},
                {0, 0, 2, 0, 0, 3, 6, 0, 1},
                {0, 0, 3, 8, 0, 0, 0, 0, 0},
                {0, 0, 0, 6, 0, 2, 0, 0, 0},
                {6, 8, 5, 9, 0, 0, 0, 0, 2},
                {0, 0, 0, 4, 7, 0, 1, 5, 0}
        };
        int[][] sudoku27 = {
                {0, 0, 0, 0, 1, 0, 7, 9, 0},
                {3, 1, 0, 0, 0, 0, 0, 0, 6},
                {0, 6, 0, 4, 0, 0, 0, 1, 0},
                {0, 0, 3, 0, 0, 0, 1, 4, 0},
                {0, 0, 0, 5, 0, 1, 8, 0, 3},
                {0, 9, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 3, 0, 8, 9, 0, 0},
                {0, 0, 6, 0, 0, 0, 4, 5, 2},
                {1, 0, 0, 0, 0, 0, 6, 0, 0}
        };
        int[][] sudoku28 = {
                {9, 0, 0, 0, 0, 2, 0, 0, 0},
                {0, 0, 0, 9, 3, 8, 1, 0, 0},
                {6, 0, 2, 1, 4, 0, 0, 0, 0},
                {0, 6, 0, 0, 0, 0, 8, 7, 0},
                {4, 5, 0, 2, 8, 6, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 2, 6},
                {0, 0, 0, 6, 0, 4, 0, 8, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 8, 6, 0, 0, 0, 5, 3, 0}
        };
        int[][] sudoku29 = {
                {3, 0, 0, 0, 4, 0, 6, 0, 8},
                {5, 0, 0, 8, 0, 7, 0, 9, 0},
                {2, 0, 0, 1, 0, 0, 4, 0, 0},
                {6, 0, 3, 0, 8, 0, 0, 2, 1},
                {0, 0, 0, 0, 7, 0, 0, 0, 0},
                {1, 0, 0, 3, 0, 0, 5, 8, 0},
                {0, 2, 6, 0, 0, 0, 8, 0, 0},
                {0, 0, 8, 0, 0, 0, 0, 0, 3},
                {0, 0, 0, 5, 0, 0, 2, 7, 0}
        };
        int[][] sudoku30 = {
                {0, 0, 5, 0, 4, 1, 0, 0, 0},
                {9, 0, 0, 0, 7, 3, 0, 0, 0},
                {0, 0, 0, 0, 9, 0, 8, 7, 3},
                {0, 0, 0, 3, 1, 7, 0, 0, 0},
                {0, 1, 7, 0, 0, 8, 0, 0, 0},
                {0, 0, 6, 0, 0, 0, 1, 0, 0},
                {0, 0, 3, 0, 6, 0, 5, 8, 2},
                {6, 0, 0, 1, 0, 0, 0, 3, 0},
                {7, 8, 2, 9, 0, 0, 0, 0, 0}
        };
        int[][] sudoku31 = {
                {0, 0, 0, 0, 0, 0, 5, 2, 1},
                {0, 0, 1, 5, 8, 6, 0, 7, 0},
                {0, 3, 7, 9, 0, 0, 0, 0, 0},
                {0, 0, 2, 0, 9, 3, 0, 0, 4},
                {6, 0, 9, 0, 0, 0, 0, 8, 0},
                {0, 5, 0, 0, 0, 7, 0, 0, 2},
                {0, 0, 0, 0, 5, 0, 0, 1, 7},
                {8, 0, 0, 0, 0, 0, 0, 0, 5},
                {2, 0, 0, 4, 0, 0, 9, 6, 8}
        };
        int[][] sudoku32 = {
                {7, 0, 0, 0, 5, 0, 9, 3, 1},
                {0, 2, 0, 0, 0, 0, 7, 0, 5},
                {0, 0, 0, 6, 0, 0, 8, 0, 4},
                {0, 0, 5, 3, 0, 0, 0, 0, 0},
                {0, 0, 0, 4, 2, 8, 0, 0, 3},
                {2, 0, 9, 1, 7, 0, 0, 0, 8},
                {4, 0, 0, 0, 0, 0, 0, 0, 0},
                {9, 0, 2, 0, 8, 0, 4, 7, 0},
                {0, 0, 3, 0, 9, 0, 1, 5, 0}
        };
        int[][] sudoku33 = {
                {0, 3, 6, 9, 2, 0, 0, 0, 4},
                {0, 0, 0, 0, 8, 6, 0, 7, 3},
                {8, 0, 0, 0, 0, 0, 9, 0, 2},
                {4, 0, 0, 0, 0, 0, 0, 0, 6},
                {5, 6, 9, 0, 0, 0, 0, 3, 7},
                {0, 0, 0, 6, 3, 0, 0, 8, 0},
                {0, 4, 7, 1, 0, 8, 0, 2, 0},
                {0, 0, 0, 2, 0, 9, 0, 0, 0},
                {6, 0, 1, 3, 0, 5, 0, 0, 0}
        };
        int[][] sudoku34 = {
                {0, 0, 0, 0, 1, 8, 9, 7, 0},
                {9, 3, 0, 0, 5, 0, 1, 0, 8},
                {0, 8, 2, 0, 0, 3, 0, 0, 0},
                {2, 0, 0, 3, 0, 0, 0, 0, 9},
                {0, 9, 4, 0, 0, 2, 0, 6, 0},
                {0, 7, 1, 0, 6, 0, 0, 8, 0},
                {0, 0, 9, 0, 3, 0, 2, 1, 0},
                {0, 2, 0, 0, 0, 0, 8, 0, 0},
                {6, 1, 5, 8, 0, 9, 0, 0, 0}
        };
        int[][] sudoku35 = {
                {0, 3, 0, 4, 1, 0, 0, 0, 9},
                {4, 1, 9, 6, 0, 0, 0, 2, 3},
                {0, 0, 0, 0, 0, 0, 4, 8, 0},
                {0, 9, 0, 2, 7, 0, 3, 0, 8},
                {6, 0, 7, 0, 0, 0, 0, 0, 0},
                {2, 0, 0, 8, 0, 6, 0, 0, 4},
                {0, 0, 0, 0, 0, 0, 8, 0, 0},
                {8, 0, 6, 5, 2, 0, 0, 3, 0},
                {9, 2, 0, 7, 3, 0, 1, 4, 0}
        };
        int[][] sudoku36 = {
                {0, 0, 3, 2, 0, 0, 0, 0, 4},
                {0, 0, 0, 0, 0, 8, 0, 5, 7},
                {0, 6, 8, 0, 7, 0, 0, 0, 0},
                {0, 9, 0, 5, 0, 0, 2, 1, 0},
                {0, 3, 0, 0, 0, 0, 7, 8, 9},
                {2, 8, 0, 0, 0, 1, 0, 0, 6},
                {8, 4, 5, 7, 9, 3, 0, 2, 0},
                {1, 7, 9, 8, 6, 0, 0, 3, 0},
                {0, 0, 6, 0, 0, 0, 9, 0, 0}
        };
        int[][] sudoku37 = {
                {5, 9, 0, 4, 3, 0, 0, 0, 1},
                {0, 8, 0, 0, 1, 0, 9, 0, 3},
                {0, 0, 0, 8, 0, 7, 2, 0, 6},
                {0, 2, 0, 0, 0, 0, 5, 0, 0},
                {0, 0, 4, 0, 7, 0, 0, 1, 0},
                {6, 7, 0, 0, 0, 9, 4, 3, 0},
                {0, 3, 0, 7, 0, 4, 8, 6, 9},
                {0, 6, 0, 1, 5, 0, 3, 7, 0},
                {0, 0, 0, 0, 6, 0, 1, 2, 0}
        };
        int[][] sudoku38 = {
                {0, 0, 0, 0, 0, 8, 3, 7, 0},
                {0, 3, 8, 1, 5, 7, 4, 6, 0},
                {5, 0, 0, 0, 0, 2, 1, 8, 0},
                {0, 7, 4, 5, 0, 9, 0, 0, 6},
                {2, 0, 0, 0, 0, 0, 0, 0, 0},
                {8, 0, 0, 3, 2, 1, 7, 0, 0},
                {6, 0, 0, 0, 4, 0, 0, 0, 7},
                {3, 4, 9, 8, 0, 5, 0, 2, 1},
                {0, 0, 2, 0, 0, 0, 5, 0, 3}
        };
        int[][] sudoku39 = {
                {0, 0, 0, 9, 0, 5, 3, 4, 0},
                {4, 9, 0, 3, 7, 0, 8, 1, 6},
                {1, 2, 0, 8, 4, 0, 0, 0, 7},
                {0, 0, 8, 0, 0, 0, 4, 0, 0},
                {2, 1, 7, 4, 0, 3, 0, 0, 0},
                {0, 0, 4, 0, 5, 7, 0, 2, 0},
                {0, 4, 0, 0, 3, 0, 6, 9, 0},
                {0, 5, 9, 0, 0, 0, 7, 8, 0},
                {0, 7, 0, 0, 9, 8, 0, 0, 4}
        };
        int[][] sudoku40 = {
                {8, 7, 3, 4, 9, 0, 0, 6, 5},
                {0, 0, 2, 0, 6, 7, 9, 3, 0},
                {6, 0, 0, 5, 0, 2, 0, 8, 1},
                {0, 0, 4, 0, 8, 0, 3, 0, 0},
                {0, 0, 7, 9, 0, 0, 1, 5, 6},
                {0, 5, 1, 6, 0, 0, 0, 4, 2},
                {0, 0, 0, 2, 1, 0, 0, 0, 0},
                {0, 0, 6, 3, 4, 0, 0, 0, 0},
                {4, 2, 0, 0, 5, 9, 0, 0, 3}
        };
        int[][] sudoku41 = {
                {5, 2, 0, 1, 0, 0, 8, 6, 9},
                {0, 9, 6, 0, 0, 5, 0, 0, 0},
                {0, 0, 8, 6, 0, 0, 0, 5, 3},
                {6, 3, 7, 0, 4, 0, 0, 0, 0},
                {4, 1, 5, 7, 0, 0, 0, 9, 8},
                {0, 0, 0, 5, 3, 1, 6, 0, 4},
                {0, 0, 4, 8, 0, 7, 5, 3, 0},
                {3, 7, 2, 0, 0, 0, 0, 0, 0},
                {8, 5, 0, 2, 9, 0, 7, 0, 0}
        };
        int[][] sudoku42 = {
                {0, 0, 9, 2, 0, 5, 0, 0, 4},
                {0, 6, 0, 8, 0, 9, 0, 0, 2},
                {0, 0, 1, 6, 4, 3, 5, 9, 7},
                {0, 0, 0, 0, 0, 0, 0, 6, 0},
                {4, 7, 2, 0, 5, 0, 9, 1, 0},
                {6, 0, 3, 7, 0, 8, 0, 2, 0},
                {0, 0, 5, 0, 3, 0, 2, 4, 6},
                {0, 9, 7, 0, 6, 0, 8, 0, 1},
                {2, 4, 0, 0, 8, 1, 3, 0, 0}
        };
        int[][] sudoku43 = {
                {7, 1, 0, 0, 0, 9, 5, 0, 2},
                {2, 3, 9, 7, 0, 0, 0, 0, 0},
                {8, 0, 0, 1, 6, 2, 3, 0, 0},
                {0, 2, 0, 8, 0, 6, 7, 5, 0},
                {0, 6, 0, 0, 2, 4, 8, 0, 3},
                {0, 0, 0, 0, 9, 7, 0, 4, 6},
                {0, 0, 0, 9, 8, 0, 1, 2, 4},
                {3, 9, 8, 0, 0, 1, 0, 0, 5},
                {0, 4, 2, 0, 7, 5, 0, 3, 0}
        };
        int[][] sudoku44 = {
                {0, 0, 0, 0, 4, 9, 6, 5, 0},
                {4, 8, 9, 6, 0, 5, 3, 0, 0},
                {6, 1, 0, 0, 0, 2, 0, 0, 9},
                {0, 5, 2, 0, 0, 7, 0, 4, 3},
                {0, 7, 0, 0, 5, 4, 9, 1, 2},
                {0, 0, 4, 1, 0, 8, 0, 7, 0},
                {0, 0, 0, 2, 0, 6, 1, 0, 5},
                {0, 9, 3, 0, 7, 1, 0, 0, 8},
                {2, 6, 0, 0, 8, 0, 7, 9, 4}
        };
        int[][] sudoku45 = {
                {5, 0, 0, 0, 0, 0, 0, 1, 2},
                {8, 6, 1, 2, 0, 7, 0, 0, 9},
                {2, 7, 0, 3, 0, 0, 0, 5, 0},
                {0, 0, 3, 0, 8, 0, 9, 2, 0},
                {0, 8, 6, 7, 0, 9, 0, 4, 5},
                {9, 2, 7, 0, 0, 3, 6, 0, 1},
                {0, 1, 0, 0, 6, 0, 2, 0, 3},
                {6, 4, 0, 9, 0, 1, 5, 7, 8},
                {0, 0, 5, 0, 7, 2, 1, 0, 4}
        };
        int[][] sudoku46 = {
                {0, 0, 3, 9, 6, 0, 2, 0, 7},
                {2, 7, 9, 0, 0, 0, 1, 0, 0},
                {4, 5, 0, 7, 1, 0, 9, 3, 8},
                {7, 4, 0, 8, 0, 6, 0, 0, 0},
                {0, 0, 0, 5, 0, 7, 6, 8, 2},
                {6, 0, 8, 1, 9, 0, 4, 7, 5},
                {0, 0, 0, 0, 7, 9, 8, 0, 4},
                {3, 0, 0, 6, 8, 0, 5, 0, 0},
                {8, 6, 0, 2, 0, 1, 7, 0, 3}
        };

        int[][] sudokuBoard = sudoku17;
        BruteforceSudokuSolver btSudokuSolver = new BruteforceSudokuSolver();
        boolean btResult = btSudokuSolver.solveSudoku(sudokuBoard);

        ConstraintSudokuSolver cSudokuSolver = new ConstraintSudokuSolver();
        boolean cResult = cSudokuSolver.solveSudoku(sudokuBoard);

        if(btResult && cResult)
            System.out.println("Success!");
    }
}