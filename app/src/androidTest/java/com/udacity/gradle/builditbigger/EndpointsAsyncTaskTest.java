package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;
import android.util.Pair;

import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getContext;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    private static final String TAG = EndpointsAsyncTaskTest.class.getName();

    @Test
    public void endpointsAsyncTaskTest_retrievedNonEmptyString() {
        String result = "";
        EndpointsAsyncTaskMain endpointsAsyncTaskMain = new EndpointsAsyncTaskMain();
        endpointsAsyncTaskMain.execute(new Pair<Context, String>(getContext(), "Jevon"));

        try {
            result = endpointsAsyncTaskMain.get();
            Log.d(TAG, "Non-empty string from Cloud Endpoints: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
        assertTrue(!result.isEmpty());
    }

}
