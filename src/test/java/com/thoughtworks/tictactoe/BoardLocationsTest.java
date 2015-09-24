package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by pvillarr on 9/24/15.
 */
public class BoardLocationsTest {

    private BoardLocations boardLocations;

    @Before

    public void setup(){
        boardLocations = new BoardLocations();
    }
    @Test
    public void shouldChangeValueOfLocationToXWhenPlacingXAtThatLocation(){
        boardLocations.placeX("1");
        assertThat(boardLocations.hasX("1"), is(true));

    }

}