package com.thoughtworks.tictactoe;
// Perla Villarreal

import java.io.PrintStream;

public class Game {
    private PrintStream printStream;

    public Game(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void start() {
        printStream.println("  |   |\n" +
                            "---------\n" +
                            "  |   |\n" +
                            "---------\n" +
                            "  |   |");
    }
}
