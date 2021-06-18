package com.example.hellospring.workshop01;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class Random7 extends Random{
    @Override
    public int nextInt(int bound) {
        return 7;
    }
}

class GenrtateUUIDTest {



    @Test
    public void  getUUID(){
        GenrtateUUID genrtateUUID = new GenrtateUUID();
        genrtateUUID.setRandom(new Random7());
        String uuid = genrtateUUID.get("Thana");
        assertEquals("XYZThana7",uuid);
    }

}