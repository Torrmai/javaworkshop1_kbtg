package com.example.hellospring.workshop01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateUUIDTest {
    @Test
    public void getUUID(){
        GenerateUUID genUUID = new GenerateUUID();
        GenerateUUID.toogle_test(7);
        String uuid = genUUID.get("somkiat");
        assertEquals("XYZsomkiat7",uuid);
    }
}