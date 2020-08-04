package com.mohamedsobhy.movies_mvp.view.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mohamedsobhy.movies_mvp.R;
import com.mohamedsobhy.movies_mvp.models.MovieModel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, MovieView {

    TextView movieNameTextView;
    Button getMovieButton;
    MoviePresenter moviePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieNameTextView = findViewById(R.id.textView);
        getMovieButton = findViewById(R.id.button);
        getMovieButton.setOnClickListener(this);
        moviePresenter = new MoviePresenter(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                moviePresenter.getMovieName();
                break;
        }
    }

    @Override
    public void onGetMovieName(String name) {
        movieNameTextView.setText(name);
    }
}