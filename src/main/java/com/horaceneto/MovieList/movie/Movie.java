package com.horaceneto.MovieList.movie;
import com.horaceneto.MovieList.director.Director;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.UUID;

public class Movie {

    private UUID id;

    private String title;

    @OneToMany
    private Director director;

    private String genre;

    private int year;

    private double rating;

}
