package com.design.patterns.creational.abstractFactory.second.example;

public class ComedyMovieFactory implements IMovieFactory {
    @Override
    public IHollywoodMovie getHollywoodMovie() {
        return new HollywoodComedyMovie();
    }

    @Override
    public IBollywoodMovie getBollywoodMovie() {
        return new BollywoodComedyMovie();
    }
}
