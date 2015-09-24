package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GameTest {
    private PrintStream printStream;
    private Game game;
    private Board board;
    private BufferedReader reader;

    @Before
    public void setup(){
        printStream = mock(PrintStream.class);
        board = mock(Board.class);
        reader = mock(BufferedReader.class);
        game = new Game(printStream, reader, board);
    }

    @Test
    public void shouldDrawBoardWhenStarts() throws IOException {
        game.start();
        verify(board).drawBoard();
    }


    @Test
    public void shouldPromptPlayerOneToMakeMoveAfterStarting() throws IOException {
        game.start();
        verify(printStream).println("Player 1 Move: Please enter a number between 1 and 9 indicating your next move.");
    }

    @Test
    public void shouldRedrawTheBoardWhenUserInputsValidMove() throws IOException {
        when(reader.readLine()).thenReturn("1");
        game.start();
        verify(board).redrawBoard(true, "1");

    }


}