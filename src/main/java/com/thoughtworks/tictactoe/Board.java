package com.thoughtworks.tictactoe;

import java.io.PrintStream;

/**
 * Created by pvillarr on 9/24/15.
 */
public class Board {
    private PrintStream printStream;
    private String currentBoard;
    private BoardLocations boardLocations;

    public Board(PrintStream printStream, BoardLocations boardLocations) {
        this.printStream = printStream;
        this.boardLocations = boardLocations;
        this.currentBoard = "  |   |\n" +
                            "---------\n" +
                            "  |   |\n" +
                            "---------\n" +
                            "  |   |";
    }

    public void drawBoard() {
        printStream.println(currentBoard);
    }

    public void redrawBoard(boolean isPlayer1, String move) {
        boardLocations.placeX(move);
        printStream.println(currentBoard);


    }
}
