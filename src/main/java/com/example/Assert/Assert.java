package com.example.Assert;

import java.io.File;

class Assert {

    static boolean fileExists(String absPath) {
        return new File(absPath).exists();
    }
}
