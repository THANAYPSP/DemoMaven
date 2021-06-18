package com.example.hellospring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    public void Inputone(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        String res = fizzBuzz.CheckFizzBuzz(1);
        assertEquals("1",res);
    }

    @Test
    public void InputThree(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        String res = fizzBuzz.CheckFizzBuzz(3);
        assertEquals("Fizz",res);
    }

    

}