package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

import com.jevonaverill.jokesandroidlibrary.JokeActivity;
import com.jevonaverill.jokeslibrary.Jokes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().
                add(R.id.fragment, new MainActivityFragment()).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        // Toast.makeText(this, "Hello, this is Jevon Averill!", Toast.LENGTH_SHORT).show();

        // TODO ("Step 1: Create a Java library - call jokes from created java library")
        // Jokes jokes = new Jokes();
        // Toast.makeText(this, jokes.tellFromJokesLibrary(), Toast.LENGTH_SHORT).show();

        // TODO ("Step 2: Create an Android library)
        // launchJokeActivity(view);

        // TODO ("Step 3: Create GCE Module)
        // 1st option
        // new EndpointsAsyncTaskMain().execute(new Pair<Context, String>(this, "Jevon"));
        // 2nd option
        // new EndpointsAsyncTaskMain().execute();

        // TODO ("Step 5")
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressbar);
        new EndpointsAsyncTask(this, progressBar).execute();
    }

    // TODO ("Step 2: Create an Android library)
    public void launchJokeActivity(View view) {
        Intent intent = new Intent(this, JokeActivity.class);
        Jokes jokes = new Jokes();

        // normal joke
        // String joke = jokes.tellJokeFromJokesLibrary();

        // random joke
        String joke = jokes.tellRandomJokeFromJokesLibrary();

        intent.putExtra(JokeActivity.JOKE_KEY, joke);
        startActivity(intent);
    }
}
