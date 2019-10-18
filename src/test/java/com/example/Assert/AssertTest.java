package com.example.Assert;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AssertTest {

    @Test
    public void fileExists() {
        assertTrue(Assert.fileExists("src/test/resources/dummy1.txt"));
        assertFalse(Assert.fileExists("src/test/resources/dummy123.txt"));
    }

    @Test
    public void fileEquals() {
        assertTrue(Assert.fileEquals("src/test/resources/dummy1.txt", "src/test/resources/dummy2.txt"));
        assertFalse(Assert.fileEquals("src/test/resources/dummy1.txt", "src/test/resources/dummy3.txt"));
    }

    @Test
    public void fileIsReadable() {
        assertTrue(Assert.fileIsReadable("src/test/resources/dummy1.txt"));
    }

    @Test
    public void fileIsWritable() {
        assertTrue(Assert.fileIsWritable("src/test/resources/dummy1.txt"));
    }

}
