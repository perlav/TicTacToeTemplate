package com.thoughtworks.tictactoe;
// Perla Villarreal

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Game {
    private PrintStream printStream;
    private Board board;
    private BufferedReader reader;

    public Game(PrintStream printStream, BufferedReader reader, Board board) {
        this.printStream = printStream;
        this.reader = reader;
        this.board = board;
    }

    public void start() throws IOException {
        board.drawBoard();
        printStream.println("Player 1 Move: Please enter a number between 1 and 9 indicating your next move.");

        String move = reader.readLine();
        board.redrawBoard(true, move);
    }
}
