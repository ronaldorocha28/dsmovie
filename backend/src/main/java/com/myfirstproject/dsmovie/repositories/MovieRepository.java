package com.myfirstproject.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myfirstproject.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}