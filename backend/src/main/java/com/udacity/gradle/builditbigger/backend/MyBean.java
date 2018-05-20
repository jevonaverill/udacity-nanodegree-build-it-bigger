package com.udacity.gradle.builditbigger.backend;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyBean {

    private String myData;

    public String getData() {
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }

//    private Jokes jokes;

//    public MyBean() {
//        jokes = new Jokes();
//    }

//    public String getJoke() {
//        return jokes.tellRandomJokeFromJokesLibrary();
//    }

}
