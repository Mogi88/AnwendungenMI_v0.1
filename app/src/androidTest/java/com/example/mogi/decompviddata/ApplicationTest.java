package com.example.mogi.decompviddata;

import android.app.Application;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
        DecompMP4Data decomp = new DecompMP4Data();
        // a new comment
        // another comment
        // third comment
        // some comment
        DecompMP4Data decomp2 = new DecompMP4Data();
    }
}