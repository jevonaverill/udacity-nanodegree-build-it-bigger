package com.jevonaverill.jokesandroidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class JokeActivityFragment extends Fragment {

    public JokeActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_joke, container, false);
        Intent intent = getActivity().getIntent();
        String jokeKey = intent.getStringExtra(JokeActivity.JOKE_KEY);
        TextView tvJoke = (TextView) root.findViewById(R.id.tvJoke);
        if (jokeKey != null && jokeKey.length() != 0) {
            tvJoke.setText(jokeKey);
        }

        return root;
    }
}
