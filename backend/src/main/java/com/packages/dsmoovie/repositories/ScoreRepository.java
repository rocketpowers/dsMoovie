package com.packages.dsmoovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.packages.dsmoovie.entities.Score;
import com.packages.dsmoovie.entities.ScorePk;

public interface ScoreRepository extends JpaRepository<Score, ScorePk> {

}
