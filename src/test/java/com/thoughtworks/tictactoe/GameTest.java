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
    private Board board;
    private BufferedReader reader;
    private Player playerOne;
    private Player playerTwo;

    @Before
    public void setup(){
        printStream = mock(PrintStream.class);
        board = mock(Board.class);
        reader = mock(BufferedReader.class);
        playerOne = mock(Player.class);
        playerTwo = mock(Player.class);
        game = new Game(printStream, reader, board, playerOne, playerTwo);
    }

    @Test
    public void shouldDrawBoardWhenStarts() throws IOException {
        game.start();
        verify(board).drawBoard();
    }

    @Test
    public void shouldPromptPlayerOneToMakeMoveAtStart() throws IOException {
        game.start();
        verify(playerOne).hasTurn();
    }


    @Test
    public void shouldRedrawTheBoardWhenPlayerOneInputsValidMove() throws IOException {
        when(reader.readLine()).thenReturn("1");
        game.start();
        verify(board).makeMove(true, "1");

    }


    @Test
    public void shouldRedrawTheBoardWhenPlayerTwoInputsValidMove() throws IOException {
        when(reader.readLine()).thenReturn("2");
        game.start();
        verify(board).makeMove(false, "2");

    }

}