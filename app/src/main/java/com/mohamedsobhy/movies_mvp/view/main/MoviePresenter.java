package com.mohamedsobhy.movies_mvp.view.main;

import com.mohamedsobhy.movies_mvp.models.MovieModel;

public class MoviePresenter {

    MovieView view;

    public MoviePresenter(MovieView view) {
        this.view = view;
    }

    public MovieModel getMovieFromDatabase(){
        return new MovieModel("cast away" , "1-1-1997" , "very sad movie" , 1);
    }

    public void getMovieName(){
        view.onGetMovieName(getMovieFromDatabase().getName());
    }
}
