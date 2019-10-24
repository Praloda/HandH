package ru.company.test.handh;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestHandH {
    @Test
    public void testFindMax () {
        assertEquals(HandH.findMax(new int[]{3,7,12,28,8}),3);
    }
}
