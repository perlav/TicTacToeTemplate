package com.thoughtworks.tictactoe;

import java.io.PrintStream;

/**
 * Created by pvillarr on 9/24/15.
 */
public class Player {
    private boolean isPlayerOne;
    PrintStream printStream;

    public Player(boolean isPlayerOne, PrintStream printStream){
        this.isPlayerOne = isPlayerOne;
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
}
