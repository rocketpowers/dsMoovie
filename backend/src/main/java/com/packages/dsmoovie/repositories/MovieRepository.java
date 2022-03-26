package com.packages.dsmoovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.packages.dsmoovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
