package edu.comp438.my_first_ass.model;

public class Factory {

    public InterFaceMovies getModel()

    {

        return new MoviesDa();
    }
}
