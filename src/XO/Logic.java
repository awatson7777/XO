package XO;

import static XO.Board.board;

public class Logic {

    public static boolean checkWin() {
        return (checkDiagonalWin() || checkHorizontalWin() || checkVerticalWin());

    }

    public static boolean checkDiagonalWin() {
        if ((board[0][0] == board[1][1]) && (board[0][0] == board[2][2]) && (board[1][1] != "-")) {
            return true;
        }
        if ((board[0][2] == board[1][1]) && (board[0][2] == board[2][0]) && (board[1][1] != "-")) {
            return true;
        }
        return false;
    }

    public static boolean checkHorizontalWin() {
        // for (int i = 0; i < board.length; i++) {
        if ((board[0][0] == board[0][1]) && (board[0][0] == board[0][2]) && (board[0][0] != "-")) {
            return true;
        }
        if ((board[1][0] == board[1][1]) && (board[1][0] == board[1][2]) && (board[1][0] != "-")) {
            return true;
        }
        if ((board[2][0] == board[2][1]) && (board[2][0] == board[2][2]) && (board[2][0] != "-")) {
            return true;
        }
        // }
        return false;
    }

    public static boolean checkVerticalWin() {
        // for (int j = 0; j < board.length; j++) {
        if ((board[0][0] == board[1][0]) && (board[0][0] == board[2][0]) && (board[0][0] != "-")) {
            return true;
        }
        if ((board[0][1] == board[1][1]) && (board[0][1] == board[2][1]) && (board[0][1] != "-")) {
            return true;
        }
        if ((board[0][2] == board[1][2]) && (board[0][2] == board[2][2]) && (board[0][2] != "-")) {
            return true;
        }
        // }
        return false;
    }

    public static boolean checkDraw() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == "-") {
                    return false;
                }
            }
        }
        return true;
    }

}
