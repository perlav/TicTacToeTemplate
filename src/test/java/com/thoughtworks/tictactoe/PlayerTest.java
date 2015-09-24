package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by pvillarr on 9/24/15.
 */
public class PlayerTest {
    private PrintStream printStream;
    private Player playerOne;
    private Player playerTwo;

    @Before
    public void setup(){
        printStream = mock(PrintStream.class);
        playerOne = new Player(true, printStream);
        playerTwo = new Player(false, printStream);
    }

    @Test
    public void shouldPromptPlayerOneWhenPlayerOneHasTurn() throws Exception {
        playerOne.hasTurn();
        verify(printStream).println("Player 1 Move: Please enter a number between 1 and 9 indicating your next move.");
    }

    @Test
    public void shouldPromptPlayerTwoWhenPlayerTwoHasTurn() throws Exception {
        playerTwo.hasTurn();
        verify(printStream).println("Player 2 Move: Please enter a number between 1 and 9 indicating your next move.");
    }
}