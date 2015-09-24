package com.thoughtworks.tictactoe;

import java.io.PrintStream;

/**
 * Created by pvillarr on 9/24/15.
 */
public class Player {
    private boolean isPlayerOne;
    PrintStream printStream;
    private BoardLocations boardLocations;

    public Player(boolean isPlayerOne, BoardLocations boardLocations, PrintStream printStream){
        this.isPlayerOne = isPlayerOne;
        this.boardLocations = boardLocations;
        this.printStream = printStream;
    }

    public void hasTurn() {
        if(isPlayerOne){
            printStream.println("Player 1 Move: Please enter a number between 1 and 9 indicating your next move.");
        }

        else {
            printStream.println("Player 2 Move: Please enter a number between 1 and 9 indicating your next move.");
        }
    }

    public void makeMove(String move) {
        if(this.isPlayerOne){
            boardLocations.placeX(move);
        }
        else{
            boardLocations.placeO(move);
        }

        boardLocations.printCurrentBoard();
    }
}
