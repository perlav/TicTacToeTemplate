package com.thoughtworks.tictactoe;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GameTest {

    @Test
    public void shouldDrawBoardWhenStarts() {
        PrintStream printStream = mock(PrintStream.class);
        Game game = new Game(printStream);
        game.start();

        verify(printStream).println("  |   |\n" +
                                    "---------\n" +
                                    "  |   |\n" +
                                    "---------\n" +
                                    "  |   |");

    }

}