package com.jevonaverill.jokeslibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jokes {
    // TODO ("Step 1: Create a Java library - create jokes from created java library")
    public String tellJokeFromJokesLibrary() {
        return "This is a joke from jokes library!";
    }

    private List<String> jokes;
    private Random random;

    public Jokes() {
        random = new Random();
        jokes = new ArrayList<>();
        jokes.add("ProgressBars go around in circles and Spinners don't spin");
        jokes.add("Why do Java developers wear glasses? Because they don't C#");
    }

    public String tellRandomJokeFromJokesLibrary() {
        return jokes.get(random.nextInt(jokes.size()));
    }
}
