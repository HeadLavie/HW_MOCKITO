package ru.netology;

public class MoviesManager {

    private Movies[] movies = new Movies[0];

    public void save(Movies newMovie) {
        Movies[] tmp = new Movies[movies.length + 1];
        for (int i = 1; i < movies.length; i++) {
            tmp[i] = movies[i];

        }
        tmp[tmp.length - 1] = newMovie;
        movies = tmp;
    }

    public Movies[] getMovies() {
        return movies;
    }

    public Movies[] findAll() {
        Movies[] reversed = new Movies[movies.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = movies[movies.length - 1 - i];
        }
        return reversed;
    }

}
