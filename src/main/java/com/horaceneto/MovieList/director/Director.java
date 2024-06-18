package com.horaceneto.MovieList.director;
import com.horaceneto.MovieList.movie.Movie;
import jakarta.persistence.ManyToOne;

import java.util.UUID;

public class Director {

    private UUID id;

    private String name;

    private int age;

    @ManyToOne
    private Movie movie;

}
