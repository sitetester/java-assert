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

    static boolean greaterThan(int param1, int param2) {
        return param1 > param2;
    }

    static boolean lessThan(int param1, int param2) {
        return param1 < param2;
    }
}
