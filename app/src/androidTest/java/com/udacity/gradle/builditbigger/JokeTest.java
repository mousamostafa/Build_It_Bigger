package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.test.ApplicationTestCase;

import java.util.concurrent.ExecutionException;

public class JokeTest extends ApplicationTestCase<Application> {
    public JokeTest() {
        super(Application.class);
    }
    public void test() throws ExecutionException,InterruptedException{
        AsyncTaskEndPoint taskEndPoint=new AsyncTaskEndPoint(new AsyncTaskEndPoint.Callback() {
            @Override
            public void finish(String string) {

            }
        });
        taskEndPoint.execute();
        assertNotNull(taskEndPoint.get());

    }
}
