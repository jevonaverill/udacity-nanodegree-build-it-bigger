package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;
import android.util.Pair;

import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getContext;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;

// TODO ("Step 4: Add Functional Tests")
@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    private static final String TAG = EndpointsAsyncTaskTest.class.getName();

    private static final String failed = "Failed to connect to /10.0.2.2:8080";

    @Test
    public void endpointsAsyncTaskTest_retrievedNonEmptyString() {
        String result = "";
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute(new Pair<Context, String>(getContext(), "Jevon"));

        try {
            result = endpointsAsyncTask.get();
            Log.d(TAG, "Non-empty string from Cloud Endpoints: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
        assertFalse(!result.isEmpty());
    }

    @Test
    public void endpointsAsyncTaskTest_retrievedFailedToConnectString() {
        String result = "";
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute(new Pair<Context, String>(getContext(), "Jevon"));

        try {
            result = endpointsAsyncTask.get();
            Log.d(TAG, "Failed to connect from Cloud Endpoints: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
        assertEquals(result, failed);
    }

}
