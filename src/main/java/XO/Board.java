package XO;

public class Board {

    static String[][] board = new String[3][3];

    public static void initializeBoard() { // initialize tic tac toe
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = "-";
            }
        }
    }

    // Print out the board.
    /* |---|---|---|
       | - | - | - |
       |-----------|
       | - | - | - |
       |-----------|
       | - | - | - |
       |---|---|---|*/

    public static void printBoard() {

        for (int i = 0; i < board.length; i++) {
            System.out.println();
            for (int j = 0; j < board.length; j++) {
                if (j == 0) {
                    System.out.print("| ");
                }
                System.out.print(board[i][j] + " | ");
            }
        }
    }
}
