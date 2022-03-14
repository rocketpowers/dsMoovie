package com.packages.dsmoovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.packages.dsmoovie.entities.Moovie;

public interface MoovieRepository extends JpaRepository<Moovie, Long> {

}
