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

    @Test
    public void directoryExists() {
        assertTrue(Assert.directoryExists("src/test/resources"));
        assertFalse(Assert.directoryExists("src/test/resources123"));
    }

    @Test
    public void directoryIsReadable() {
        assertTrue(Assert.directoryIsReadable("src/test/resources"));
        assertFalse(Assert.directoryIsReadable("src/test/resources123"));
    }

    @Test
    public void directoryIsWritable() {
        assertTrue(Assert.directoryIsWritable("src/test/resources"));
    }

    @Test
    public void booleanFalse() {
        assertTrue(Assert.False(Boolean.valueOf(false)));
        assertTrue(Assert.False(Boolean.valueOf("false")));
    }

    @Test
    public void booleanTrue() {
        assertTrue(Assert.True(Boolean.valueOf(true)));
        assertTrue(Assert.True(Boolean.valueOf("true")));
    }


    @Test
    public void greaterThan() {
        assertTrue(Assert.greaterThan(2, 1));
        assertFalse(Assert.greaterThan(1, 2));
    }

    @Test
    public void lessThan() {
        assertTrue(Assert.lessThan(1, 2));
        assertFalse(Assert.lessThan(2, 1));
    }
}
