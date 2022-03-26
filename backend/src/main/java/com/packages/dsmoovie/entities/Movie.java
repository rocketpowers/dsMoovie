package com.packages.dsmoovie.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "tb_movie")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;
	private Double score;
	private Integer count;
	private String image;

	@OneToMany(mappedBy = "id.movie")
	private Set<Score> scores = new HashSet<>();

	public Movie() {

	}

	public Movie(Long id, String title, Double score, Integer count, String image) {
		this.id = id;

		this.title = title;
		this.score = score;
		this.count = count;
		this.image = image;
	}

	
	

	public Set<Score> getScores() {
		return scores;
	}
}
