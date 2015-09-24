package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class BoardTest {

    private Board board;
    private PrintStream printStream;
    private final boolean PLAYER_ONE = true;
    private final boolean PLAYER_TWO = false;
    private BoardLocations boardLocations;

    @Before
    public void setup(){
        printStream = mock(PrintStream.class);
        boardLocations = mock(BoardLocations.class);
        board = new Board(printStream, boardLocations);
    }


    @Test
    public void shouldPlaceXInBoardLocationWhenPlayerOneMakesMove(){
        board.makeMove(PLAYER_ONE, "1");
        verify(boardLocations).placeX("1");

    }

    @Test
    public void shouldPlaceOInBoardLocationWhenPlayerTwoMakesMove(){
        board.makeMove(PLAYER_TWO, "2");
        verify(boardLocations).placeO("2");

    }




}
