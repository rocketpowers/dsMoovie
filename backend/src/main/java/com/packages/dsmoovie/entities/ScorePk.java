package com.packages.dsmoovie.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Embeddable
@Data
public class ScorePk implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Moovie moovie;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public ScorePk() {

	}

}
