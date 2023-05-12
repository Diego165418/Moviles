package com.example.laboratorio07miranda.repository

import com.example.laboratorio07miranda.data.models.MovieModel

class MovieRepository(private val movies: MutableList<MovieModel>) {
    fun getMovies() = movies
    fun addMovie(newMovie: MovieModel) = movies.add(newMovie)
}