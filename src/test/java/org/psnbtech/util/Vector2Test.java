package org.psnbtech.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Vector2Test {

    @Test
    void lengthSquaredComputesCorrectly() {
        Vector2 v = new Vector2(3.0, 4.0);
        assertEquals(25.0, v.getLengthSquared(), 0.0001);
    }

    @Test
    void distanceSquaredComputesCorrectly() {
        Vector2 a = new Vector2(0.0, 0.0);
        Vector2 b = new Vector2(3.0, 4.0);
        assertEquals(25.0, a.getDistanceToSquared(b), 0.0001);
    }
}
