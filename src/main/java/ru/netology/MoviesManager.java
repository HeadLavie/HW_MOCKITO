package ru.netology;

public class MoviesManager {

    private int resultLength;
    private Movies[] movies = new Movies[0];

    public MoviesManager() {
        this.resultLength = 5;
    }

    public MoviesManager(int resultLength) {
        this.resultLength = resultLength;
    }

    public void save(Movies newMovie) {
        Movies[] tmp = new Movies[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
            tmp[tmp.length - 1] = newMovie;
            movies = tmp;
        }

    public Movies[] findAll() {
        return movies;
    }

    public Movies[] findLast() {
        int managerLength;
        if (movies.length < resultLength) {
            managerLength = movies.length;
        } else {
            managerLength = resultLength;
        }
        Movies[] reversed = new Movies[managerLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = movies[movies.length - 1 - i];
        }
        return reversed;
    }


}
