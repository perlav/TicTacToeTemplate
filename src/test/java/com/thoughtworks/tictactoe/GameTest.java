package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GameTest {
    private PrintStream printStream;
    private Game game;
    private BoardLocations boardLocations;
    private BufferedReader reader;
    private Player playerOne;
    private Player playerTwo;

    @Before
    public void setup(){
        printStream = mock(PrintStream.class);
        boardLocations = mock(BoardLocations.class);
        reader = mock(BufferedReader.class);
        playerOne = mock(Player.class);
        playerTwo = mock(Player.class);
        game = new Game(printStream, reader, boardLocations, playerOne, playerTwo);
    }

    @Test
    public void shouldDrawBoardWhenStarts() throws IOException {
        game.start();
        verify(boardLocations).printCurrentBoard();
    }

    @Test
    public void shouldPromptPlayerOneToMakeMoveAtStart() throws IOException {
        game.start();
        verify(playerOne).takeTurn();
    }


}