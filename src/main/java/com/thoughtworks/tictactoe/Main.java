package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello Tic Tac Toe");
        BoardLocations boardLocations = new BoardLocations(System.out);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Player playerOne = new Player(true, boardLocations, System.out, reader);
        Player playerTwo = new Player(false,boardLocations, System.out, reader);

        Game game = new Game(System.out, reader,boardLocations, playerOne, playerTwo);
        game.start();

    }
}
