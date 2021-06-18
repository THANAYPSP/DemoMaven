package com.example.hellospring.workshop01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenrtateUUIDTest {

    @Test
    public void  getUUID(){
        GenrtateUUID genrtateUUID = new GenrtateUUID();
        String uuid = genrtateUUID.get("Thana");
        assertEquals("XYZThana7",uuid);
    }

}