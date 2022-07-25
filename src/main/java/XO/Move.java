package XO;

import java.util.Random;
import java.util.Scanner;

import static XO.Board.board;

public class Move {

    private static int row, column;
    public static Scanner scan = new Scanner(System.in);
    public static String currentTurn = "O";

    public static void player1Move() {
        System.out.println();
        System.out.println(Colours.green("You are X."));
        System.out.println("Your Move: ");
        System.out.println(Colours.yellow("Please enter your row (1-3)"));
        row = scan.nextInt() - 1;
        System.out.println(Colours.yellow("Please enter your column (1-3)"));
        column = scan.nextInt() - 1;
        if (board[row][column] == "-") {
            board[row][column] = turn();
        } else {
            System.out.println(Colours.red("Invalid entry. Please go again"));
            row = scan.nextInt() - 1;
            column = scan.nextInt() - 1;
            board[row][column] = turn();
        }
    }

    public static void player2Move() {
        System.out.println();
        System.out.println(Colours.green("You are O."));
        System.out.println("Your Move: ");
        System.out.println(Colours.yellow("Please enter your row (1-3)"));
        row = scan.nextInt() - 1;
        System.out.println(Colours.yellow("Please enter your column (1-3)"));
        column = scan.nextInt() - 1;
        if (board[row][column] == "-") {
            board[row][column] = turn();
        } else {
            System.out.println(Colours.red("Invalid entry. Please go again"));
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
        System.out.println(Colours.blue("The computer has played this move!"));
    }

    public static String turn() {
        if (currentTurn == "X") {
            currentTurn = "0";
        } else {
            currentTurn = "X";
        }
        return currentTurn;
    }

}
