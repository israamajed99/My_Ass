package edu.comp438.my_first_ass.model;

import java.util.ArrayList;
import java.util.List;

public class MoviesDa  implements InterFaceMovies{
    private ArrayList<Movies> movies = new ArrayList<>();

    public  MoviesDa(){
        movies.add(new Movies("artificial intelligence",2001,"Science fiction"));
        movies.add(new Movies("Sherlock Holmes",2009,"Adventure"));
        movies.add(new Movies("Cast Away",2000,"Adventure"));
        movies.add(new Movies("The Help",2011,"romantic"));
        movies.add(new Movies("Titanic",1997,"romantic"));
        movies.add(new Movies("the washing machine",2020,"comedy"));
        movies.add(new Movies("A space odyssey",2001,"Science fiction"));
    }

    public List<Movies> getMov(String cat){
       ArrayList<Movies> data = new ArrayList<>();
       for (Movies m : movies){
           if (m.getGenre().equals(cat)  ){
               data.add(m);
           }
       }

       return data;
    }

    public String[] getgenre(){
        String[] genre ={"Adventure","romantic","Science fiction","comedy"};

    return genre;
    }

    public int[] getyear(){
        int[] year ={2001,2009,2000,2011};

        return year;
    }

}
