package com.example.hellospring.workshop01;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzV2Test {
        @Test
        public void FizzBuzz1() {
            FizzBuzzV2 fb = new FizzBuzzV2();
            String result = fb.printFizzBuzzV2(1);
            String expectedValue = "1";
            assertEquals(expectedValue, result);
        }

        @Test
        public void FizzBuzz2() {
            FizzBuzzV2 fb = new FizzBuzzV2();
            String result = fb.printFizzBuzzV2(2);
            String expectedValue = "2";
            assertEquals(expectedValue, result);
        }

        @Test
        public void FizzBuzz3() {
            FizzBuzzV2 fb = new FizzBuzzV2();
            String result = fb.printFizzBuzzV2(3);
            String expectedValue = "Fizz";
            assertEquals(expectedValue, result);
        }

        @Test
        public void FizzBuzz4() {
            FizzBuzzV2 fb = new FizzBuzzV2();
            String result = fb.printFizzBuzzV2(4);
            String expectedValue = "4";
            assertEquals(expectedValue, result);
        }

        @Test
        public void FizzBuzz5() {
            FizzBuzzV2 fb = new FizzBuzzV2();
            String result = fb.printFizzBuzzV2(5);
            String expectedValue = "Buzz";
            assertEquals(expectedValue, result);
        }

        @Test
        public void FizzBuzz6() {
            FizzBuzzV2 fb = new FizzBuzzV2();
            String result = fb.printFizzBuzzV2(6);
            String expectedValue = "Fizz";
            assertEquals(expectedValue, result);
        }

        @Test
        public void FizzBuzz7() {
            FizzBuzzV2 fb = new FizzBuzzV2();
            String result = fb.printFizzBuzzV2(7);
            String expectedValue = "KBTG Java Basic";
            assertEquals(expectedValue, result);
        }

        @Test
        public void FizzBuzz8() {
            FizzBuzzV2 fb = new FizzBuzzV2();
            String result = fb.printFizzBuzzV2(8);
            String expectedValue = "8";
            assertEquals(expectedValue, result);
        }

        @Test
        public void FizzBuzz9() {
            FizzBuzzV2 fb = new FizzBuzzV2();
            String result = fb.printFizzBuzzV2(9);
            String expectedValue = "Fizz";
            assertEquals(expectedValue, result);
        }

        @Test
        public void FizzBuzz10() {
            FizzBuzzV2 fb = new FizzBuzzV2();
            String result = fb.printFizzBuzzV2(10);
            String expectedValue = "Buzz";
            assertEquals(expectedValue, result);
        }

        @Test
        public void FizzBuzz11() {
            FizzBuzzV2 fb = new FizzBuzzV2();
            String result = fb.printFizzBuzzV2(11);
            String expectedValue = "11";
            assertEquals(expectedValue, result);
        }

        @Test
        public void FizzBuzz12() {
            FizzBuzzV2 fb = new FizzBuzzV2();
            String result = fb.printFizzBuzzV2(12);
            String expectedValue = "Fizz";
            assertEquals(expectedValue, result);
        }

        @Test
        public void FizzBuzz15() {
            FizzBuzzV2 fb = new FizzBuzzV2();
            String result = fb.printFizzBuzzV2(15);
            String expectedValue = "FizzBuzz";
            assertEquals(expectedValue, result);
        }

        @Test
        public void FizzBuzz30() {
            FizzBuzzV2 fb = new FizzBuzzV2();
            String result = fb.printFizzBuzzV2(30);
            String expectedValue = "FizzBuzz";
            assertEquals(expectedValue, result);
        }

}