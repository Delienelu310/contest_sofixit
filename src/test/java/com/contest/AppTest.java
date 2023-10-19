package com.contest;

import static com.contest.App.material;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;


public class AppTest 
{

    @Test
    public void testOnEmptyArray(){
        assertEquals(0, material(new int[0]), "The empty array test");
    }

    @Test
    public void testOnNullValue(){
        assertEquals(0, material(null), "The null value test");
    }

    @Test
    public void testOnInputWithNegaitve(){
        assertThrows(NegativeInputException.class, () -> material(new int[]{1,2,3,-5,1}));
    }

    @Test
    public void testFromSite1(){
        int expected = 83;
        int[] input = new int[]{6, 4, 2, 0, 3, 2, 0, 3, 1, 4, 5, 3, 2, 7, 5, 3, 0, 1, 2, 1, 3, 4, 6, 8, 1, 3};
        assertEquals(expected, material(input), "The first site test is ok");
    }

    @Test
    public void testFromSite2(){
        int expected = 50;
        int[] input = new int[]{6, 2, 1, 1, 8, 0, 5, 5, 0, 1, 8, 9, 6, 9, 4, 8, 0, 0};
        assertEquals(expected, material(input), "The second site test is ok");
    }
}
