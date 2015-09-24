package com.thoughtworks.tictactoe;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class BoardLocations {
    private Map<String, String> boardMap = new HashMap<String, String>();
    private PrintStream printStream;

    public BoardLocations(PrintStream printStream){
        this.printStream = printStream;

        boardMap.put("1", "  ");
        boardMap.put("2", "  ");
        boardMap.put("3", "  ");
        boardMap.put("4", "  ");
        boardMap.put("5", "  ");
        boardMap.put("6", "  ");
        boardMap.put("7", "  ");
        boardMap.put("8", "  ");
        boardMap.put("9", "  ");
    }

    public void placeX(String location) {
        boardMap.put(location, "X ");
    }

    public void placeO(String location) {
        boardMap.put(location, "O ");
    }

    public boolean hasX(String location ) {
        return boardMap.get(location).equals("X ");
    }

    public boolean hasO(String location) {
        return boardMap.get(location).equals("O ");
    }

    public void printCurrentBoard() {
        printStream.println(boardMap.get("1") + "|" + boardMap.get("2") + "|" + boardMap.get("3") + "\n" +
                            "---------\n" +
                            boardMap.get("4") + "|" + boardMap.get("5") + "|" + boardMap.get("6") + "\n" +
                            "---------\n" +
                boardMap.get("7") + "|" + boardMap.get("8") + "|" + boardMap.get("9") + "\n");

    }


    public boolean isAvailable(String location) {
        if(boardMap.get(location).equals("  ")){
            return true;
        }
        else{
            return false;
        }
    }
}
