package com.thoughtworks.tictactoe;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Tic Tac Toe");

        Game game = new Game(System.out);
        game.start();

    }
}
