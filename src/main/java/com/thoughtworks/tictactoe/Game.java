package com.thoughtworks.tictactoe;
// Perla Villarreal

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Game {
    private PrintStream printStream;
    private Board board;
    private BufferedReader reader;
    private Player playerOne;
    private Player playerTwo;

    public Game(PrintStream printStream, BufferedReader reader, Board board, Player playerOne, Player playerTwo) {
        this.printStream = printStream;
        this.reader = reader;
        this.board = board;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() throws IOException {
        board.drawBoard();

        playerOne.hasTurn();
        String location = reader.readLine();
        board.makeMove(true, location);

        playerTwo.hasTurn();
        String secondLocation = reader.readLine();
        board.makeMove(false, secondLocation);






    }
}
