package com.design.patterns.creational.abstractFactory.second.example;

public interface IMovieFactory {
    IHollywoodMovie getHollywoodMovie();
    IBollywoodMovie getBollywoodMovie();
}
