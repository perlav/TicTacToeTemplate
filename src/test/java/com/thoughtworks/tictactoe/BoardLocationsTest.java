package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by pvillarr on 9/24/15.
 */
public class BoardLocationsTest {

    private BoardLocations boardLocations;
    private PrintStream printStream;

    @Before
    public void setup(){
        printStream = mock(PrintStream.class);
        boardLocations = new BoardLocations(printStream);
    }

    @Test
    public void shouldChangeValueOfLocationOneToXWhenPlacingXAtThatLocationOne(){
        boardLocations.placeX("1");
        assertThat(boardLocations.hasX("1"), is(true));
    }

    @Test
    public void shouldNotChangeValueOfLocationOneToOWhenPlacingXAtThatLocationOne(){
        boardLocations.placeX("1");
        assertThat(boardLocations.hasO("1"), is(false));
    }


    @Test
    public void shouldChangeValueOfLocationOneToOWhenPlacingOAtThatLocationOne(){
        boardLocations.placeO("1");
        assertThat(boardLocations.hasO("1"), is(true));
    }

    @Test
    public void shouldNotChangeValueOfLocationOneToXWhenPlacingOAtThatLocationOne(){
        boardLocations.placeO("1");
        assertThat(boardLocations.hasX("1"), is(false));
    }






}