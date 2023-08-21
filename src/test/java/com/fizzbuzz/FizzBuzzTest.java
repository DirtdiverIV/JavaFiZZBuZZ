package com.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void testFiZZ() {
        assertEquals("FiZZ", FizzBuzz.getFizzBuzzValue(3));
        assertEquals("FiZZ", FizzBuzz.getFizzBuzzValue(13));
    }

    @Test
    public void testBuZZ() {
        assertEquals("BuZZ", FizzBuzz.getFizzBuzzValue(5));
        assertEquals("BuZZ", FizzBuzz.getFizzBuzzValue(25));
    }

    @Test
    public void testFizzBuZZ() {
        assertEquals("FiZZBuZZ", FizzBuzz.getFizzBuzzValue(15));
        assertEquals("FiZZBuZZ", FizzBuzz.getFizzBuzzValue(30));
    }

    @Test
    public void testNormalNumber() {
        assertEquals("1", FizzBuzz.getFizzBuzzValue(1));
        assertEquals("2", FizzBuzz.getFizzBuzzValue(2));
        assertEquals("7", FizzBuzz.getFizzBuzzValue(7));
    }
}