package Kata7kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringEndsWith {
    @Test
    public void returnsThrue() {
        assertEquals("bc", "bc");
    }

    @Test
    public void returnsFalse() {
        assertEquals("d", "d");
    }
}
