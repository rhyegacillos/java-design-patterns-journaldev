package com.design.patterns.creational.abstractFactory.second.example;

public class AbstractFactoryPatternExApp {
    public static void main(String[] args) {
        System.out.println("***Abstract Factory Pattern Demo***");
        ActionMovieFactory actionMovies = new ActionMovieFactory();
        IHollywoodMovie hAction = actionMovies.getHollywoodMovie();
        IBollywoodMovie bAction = actionMovies.getBollywoodMovie();

        System.out.println("\nAction Movies are: ");
        System.out.println(hAction.MovieName());
        System.out.println(bAction.MovieName());

        IMovieFactory comedyMovies = new ComedyMovieFactory();
        IHollywoodMovie hComedy = comedyMovies.getHollywoodMovie();
        IBollywoodMovie bComedy = comedyMovies.getBollywoodMovie();

        System.out.println("\nComedy Movies are: ");
        System.out.println(hComedy.MovieName());
        System.out.println(bComedy.MovieName());
    }
}
