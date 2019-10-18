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
}
