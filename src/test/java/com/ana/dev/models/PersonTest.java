package com.ana.dev.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void testGetName() {
        //Given
        Person pepa = new Person("Pepa", "Anónima", "00112233G", 1956);
        //When
        String result = pepa.getName();
        //Then
        Assertions.assertEquals("Pepa", result);
    }

    @Test
    void testSetName() {
        //Given
        Person pepe = new Person("Pepe", "Anónima", "00112233G", 1956);
        //When
        pepe.setName("Pepa");
        //Then
        Assertions.assertEquals("Pepa", pepe.getName());
    }
}
