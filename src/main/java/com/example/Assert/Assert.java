package com.example.Assert;

import java.io.File;

class Assert {

    static boolean fileExists(String absPath) {
        return new File(absPath).exists();
    }

    static boolean fileEquals(String actual, String expected) {
        return new File(actual).compareTo(new File(expected)) == -1;
    }

    static boolean fileIsReadable(String path) {
        return new File(path).canRead();
    }

    static boolean fileIsWritable(String path) {
        return new File(path).canWrite();
    }

    static boolean directoryExists(String path) {
        return new File(path).isDirectory();
    }

    static boolean directoryIsReadable(String path) {
        var file = new File(path);

        return file.isDirectory() && file.canRead();
    }

    static boolean directoryIsWritable(String path) {
        var file = new File(path);

        return file.isDirectory() && file.canWrite();
    }

    static boolean False(Boolean value) {
        return value == false;
    }

    static boolean True(Boolean value) {
        return value == true;
    }

    static boolean greaterThan(int expected, int actual) {
        return expected > actual;
    }

    static boolean greaterThanOrEqual(int expected, int actual) {
        return expected >= actual;
    }

    static boolean lessThan(int expected, int actual) {
        return expected < actual;
    }

    static boolean lessThanOrEqual(int expected, int actual) {
        return expected <= actual;
    }

    static boolean isInt(String number) {
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException umberFormatException) {
            return false;
        }

        return true;
    }

    static boolean stringContainsString(String expected, String actual) {
        return actual.contains(expected);
    }

    static boolean stringContainsStringIgnoreCase(String expected, String actual) {
        return actual.toLowerCase().contains(expected.toLowerCase());
    }
}
