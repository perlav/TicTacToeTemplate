package com.thoughtworks.tictactoe;

import java.io.PrintStream;

/**
 * Created by pvillarr on 9/24/15.
 */
public class Board {
    private PrintStream printStream;
    private BoardLocations boardLocations;

    public Board(PrintStream printStream, BoardLocations boardLocations) {
        this.printStream = printStream;
        this.boardLocations = boardLocations;
    }

    public void drawBoard() {
        boardLocations.printCurrentBoard();
    }

    public void makeMove(boolean isPlayer1, String move) {
        if(isPlayer1){
            boardLocations.placeX(move);
        }
        else{
            boardLocations.placeO(move);
        }

        boardLocations.printCurrentBoard();


    }
}
