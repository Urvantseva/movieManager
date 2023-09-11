package ru.netology.movieManager;

public class movieManager {
    private String[] movies = new String[0];
    private final int Limit;

    public movieManager() {
        this.Limit = 5;
    }

    public movieManager(int Limit) {
        this.Limit = Limit;
    }

    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        this.movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < Limit) {
            resultLength = movies.length;
        } else {
            resultLength = Limit;
        }
        String[] ans = new String[resultLength];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = movies[movies.length - 1 - i];
        }
        return ans;
    }
}
