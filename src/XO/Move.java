package XO;

import java.util.Random;
import java.util.Scanner;

import static XO.Board.board;

public class Move {

    private static int row, column;
    public static Scanner scan = new Scanner(System.in);
    public static String currentTurn = "X";

    public static void playerMove() {
        System.out.println();
        System.out.println("Your Move: ");
        row = scan.nextInt() - 1;
        column = scan.nextInt() - 1;
        if (board[row][column] == "-") {
            board[row][column] = turn();
        } else {
            System.out.println("Invalid entry. Please go again");
            row = scan.nextInt() - 1;
            column = scan.nextInt() - 1;
            board[row][column] = turn();
        }

    }

    public static void computerMove() {
        Random computerMove = new Random();
        row = computerMove.nextInt(3);
        column = computerMove.nextInt(3);
        while (board[row][column] != "-") {
            row = computerMove.nextInt(3);
            column = computerMove.nextInt(3);
        }
        board[row][column] = turn();
        System.out.println("The computer has played this move!");
    }

    public static String turn() {
        if (currentTurn == "X") {
            currentTurn = "O";
        } else {
            currentTurn = "X";
        }
        return currentTurn;
    }

}
