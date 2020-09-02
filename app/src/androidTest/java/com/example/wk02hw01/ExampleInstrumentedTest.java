package com.example.wk02hw01;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        assertEquals("com.example.wk02hw01", appContext.getPackageName());
    }

    @Test
    public void usernameTest() {
        String verifiedUsername = "hello";
        String enteredUsername = "hello";
        Boolean returnValue;
        if (verifiedUsername.equals(enteredUsername)) {
            returnValue = true;
        } else {
            returnValue = false;
        }

        assertEquals(true, returnValue);
    }

    @Test
    public void passwordTest() {
        String verifiedPassword = "hello";
        String underedPassword = "hello";
        Boolean returnValue;
        if (verifiedPassword.equals(underedPassword)) {
            returnValue = true;
        } else {
            returnValue = false;
        }

        assertEquals(true, returnValue);
    }
}
