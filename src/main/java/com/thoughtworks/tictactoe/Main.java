package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello Tic Tac Toe");
        BoardLocations boardLocations = new BoardLocations(System.out);
        Board board = new Board(System.out, boardLocations);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Game game = new Game(System.out, reader,board);
        game.start();

    }
}
