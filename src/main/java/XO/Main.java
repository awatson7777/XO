package XO;

import java.util.Random;
import java.util.Scanner;

import static XO.Board.initializeBoard;
import static XO.Logic.checkDraw;
import static XO.Logic.checkWin;
import static XO.Board.printBoard;
import static XO.Move.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    private static String gameMode;

    private static void welcome() {
        System.out.println("Welcome to Tic Tac Toe\n");

        System.out.println("Player vs Player OR Player vs Computer? Enter 'PVP' OR 'PVE'");
        gameMode = scanner.nextLine();
        while (!gameMode.equals("PVP") && !gameMode.equals("PVE")) {
            System.out.println("Player vs Player OR Player vs Computer? Enter 'PVP' OR 'PVE'");
            gameMode = scanner.nextLine();
        }

        if (gameMode.equals("PVE")) {
            System.out.println(Colours.blue("You are playing against the computer"));
            System.out.println("Please enter your coordinates for your location row (1-3) column (1-3):");
            initializeBoard();
            printBoard();
            gameLoop();
        }
        if (gameMode.equals("PVP")) {
            System.out.println(Colours.blue("You are playing against another player"));
            System.out.println("Please enter your coordinates for your location row (1-3) column (1-3):");
            initializeBoard();
            printBoard();
            gameLoop();
        }
    }

    private static void gameLoop() {
        if (gameMode.equals("PVE")) {
            player1Move();
            printBoard();
            computerMove();
            printBoard();
        }
        if (gameMode.equals("PVP")) {
            player1Move();
            printBoard();
            player2Move();
            printBoard();
        }
    }

    public static void main(String[] args) {
        welcome();

        while ((!checkWin()) && (!checkDraw())) {
            gameLoop();
        }

        if (checkWin()) {
            System.out.println("The winner is " + currentTurn);
        }
        if (checkDraw()) {
            System.out.println("Draw");
        }
    }
}