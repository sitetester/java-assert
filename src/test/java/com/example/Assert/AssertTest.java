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
    public void greaterThanOrEqual() {
        assertTrue(Assert.greaterThanOrEqual(2, 1));
        assertTrue(Assert.greaterThanOrEqual(2, 2));
        assertFalse(Assert.greaterThanOrEqual(1, 2));
    }


    @Test
    public void lessThan() {
        assertTrue(Assert.lessThan(1, 2));
        assertFalse(Assert.lessThan(1, 1));
    }

    @Test
    public void lessThanOrEqual() {
        assertTrue(Assert.lessThanOrEqual(1, 2));
        assertTrue(Assert.lessThanOrEqual(1, 1));
        assertFalse(Assert.lessThanOrEqual(2, 1));
    }

    @Test
    public void isInt() {
        assertTrue(Assert.isInt("1"));
        assertFalse(Assert.isInt("abc"));
    }

    @Test
    public void stringContainsString() {
        assertTrue(Assert.stringContainsString("lorem", "lorem ipsum"));
        assertFalse(Assert.stringContainsString("abc123", "lorem ipsum"));
    }

    @Test
    public void stringContainsStringIgnoreCase() {
        assertTrue(Assert.stringContainsStringIgnoreCase("LoreM", "lorem ipsum"));
        assertFalse(Assert.stringContainsStringIgnoreCase("abc123", "lorem ipsum" ));
    }

    @Test
    public void stringContainsOnly() {
        assertTrue(Assert.stringContainsOnly("lorem", "lorem"));
        assertFalse(Assert.stringContainsOnly("lorem", "lorem ipsum"));
        assertFalse(Assert.stringContainsOnly("abc123", "lorem ipsum" ));
    }

    @Test
    public void isSpaceOnly() {
        assertTrue(Assert.isSpaceOnly(""));
        assertTrue(Assert.isSpaceOnly(" "));
        assertTrue(Assert.isSpaceOnly("\t"));
        assertTrue(Assert.isSpaceOnly(" \t "));
        assertFalse(Assert.isSpaceOnly(". "));
    }

    @Test
    public void divisibleBy() {
        assertTrue(Assert.divisibleBy(9, 3));
        assertFalse(Assert.divisibleBy(8, 3));
    }

    @Test
    public void isBoolean() {
        assertTrue(Assert.isBoolean("true"));
        assertFalse(Assert.isBoolean("true123"));
    }

    @Test
    public void isNull() {
        assertTrue(Assert.isNull(null));
        assertFalse(Assert.isNull("null"));
    }

    @Test
    public void regexMatch() {
        assertTrue(Assert.regexMatch("[0-9]+", "123"));
        assertFalse(Assert.regexMatch("[a-z]+", "123"));
    }

    @Test
    public void endsWith() {
        assertTrue(Assert.endsWith("lorem ipsum", "ipsum"));
        assertFalse(Assert.endsWith("lorem ipsum", "lorem"));
    }
}
