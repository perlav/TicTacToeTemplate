package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by pvillarr on 9/24/15.
 */
public class Player {
    private boolean isPlayerOne;
    PrintStream printStream;
    private BoardLocations boardLocations;
    private BufferedReader reader;

    public Player(boolean isPlayerOne, BoardLocations boardLocations, PrintStream printStream, BufferedReader reader){
        this.isPlayerOne = isPlayerOne;
        this.boardLocations = boardLocations;
        this.printStream = printStream;
        this.reader = reader;
    }

    public void takeTurn() throws IOException {
        hasTurn();
        String location = reader.readLine();
        makeMove(location);
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
        if(isPlayerOne && boardLocations.isAvailable(move)){
            boardLocations.placeX(move);
        }
        else if(!isPlayerOne && boardLocations.isAvailable(move)){
            boardLocations.placeO(move);
        }
        else{
            printStream.println("Location already taken");
        }
        boardLocations.printCurrentBoard();
    }


}
