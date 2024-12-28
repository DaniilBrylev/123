package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
    @Test
    public void simpleTest() {
        Assert.assertEquals(2 + 2, 4);
    }
}
