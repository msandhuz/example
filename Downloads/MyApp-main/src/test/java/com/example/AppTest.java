package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testAddition() {
        assertEquals(3, App.add(1, 2), "1 + 2 should equal 3");
    }
}
