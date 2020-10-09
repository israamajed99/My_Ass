package edu.comp438.my_first_ass.model;

import java.util.List;

public interface InterFaceMovies {
    List<Movies> getMov(String cat);
    String[] getgenre();
    int [] getyear();


}
