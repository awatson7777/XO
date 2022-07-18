package XO;

import java.util.Random;
import java.util.Scanner;

import static XO.Board.initializeBoard;
import static XO.Logic.checkDraw;
import static XO.Logic.checkWin;
import static XO.Board.printBoard;
import static XO.Move.playerMove;
import static XO.Move.computerMove;
import static XO.Move.currentTurn;

public class Main {

    private static void welcome() {
        System.out.println("Tic Tac Toe");
        System.out.println("Please enter your coordinates for your location row (1-3) column (1-3):");

        initializeBoard();
        printBoard();
        playerMove();
        printBoard();
        computerMove();
        printBoard();
    }

    public static void main(String[] args) {
        welcome();

        while ((!checkWin()) && (!checkDraw())) {
            playerMove();
            printBoard();
            System.out.println();
            computerMove();
            printBoard();
        }
        System.out.println();
        if (checkWin() == true) {
            System.out.println("The winner is " + currentTurn);
        }
        if (checkDraw() == true) {
            System.out.println("Draw");
        }
    }
}