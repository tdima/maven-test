package com.mt;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author Dmitry Tumash.
 */
public class MyClassTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testSuccessful() throws Exception {
        assertTrue("Successful test", true);
    }

    @Test
    public void testFail() throws Exception {
        assertTrue("Fail test", false);
    }
}
