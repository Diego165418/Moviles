package com.example.laboratorio07miranda

import android.app.Application
import com.example.laboratorio07miranda.data.moviesFromDummyData
import com.example.laboratorio07miranda.repository.MovieRepository

class MovieReviewerApplication: Application() {
    val movieRepository: MovieRepository by lazy {
        MovieRepository(moviesFromDummyData)
    }
}