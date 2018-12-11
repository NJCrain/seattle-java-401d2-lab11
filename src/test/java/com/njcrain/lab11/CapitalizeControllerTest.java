package com.njcrain.lab11;

import org.junit.Test;

import static com.njcrain.lab11.CapitalizeController.capitalize;
import static org.junit.Assert.*;
public class CapitalizeControllerTest {

    @Test
    public void testCapitalize() {
        assertEquals("Sending a string should return that string back in all caps", "TEST", capitalize("test"));
        assertEquals("Should work fine for a string with no letters", "123@&", capitalize("123@&"));
        assertEquals("A combination of letters and other characters should work too", "TH3$SE 4RE W0RDS 2", capitalize("Th3$se 4re W0rds 2"));
    }
}