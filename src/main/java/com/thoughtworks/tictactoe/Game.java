package com.thoughtworks.tictactoe;
// Perla Villarreal

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Game {
    private PrintStream printStream;
    private BoardLocations boardLocations;
    private BufferedReader reader;
    private Player playerOne;
    private Player playerTwo;

    public Game(PrintStream printStream, BufferedReader reader, BoardLocations boardLocations, Player playerOne, Player playerTwo) {
        this.printStream = printStream;
        this.reader = reader;
        this.boardLocations = boardLocations;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() throws IOException {
        boardLocations.printCurrentBoard();

        playerOne.takeTurn();
        playerTwo.takeTurn();

    }
}
