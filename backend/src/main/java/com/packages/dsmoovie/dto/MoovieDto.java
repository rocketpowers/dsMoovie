package com.packages.dsmoovie.dto;

import com.packages.dsmoovie.entities.Moovie;

import lombok.Data;


@Data
public class MoovieDto {

	private Long id;
	private String title;
	private Double score;
	private Integer count;
	private String image;

	public MoovieDto() {

	}

	public MoovieDto(Long id, String title, Double score, Integer count, String image) {
		this.id = id;
		this.title = title;
		this.score = score;
		this.count = count;
		this.image = image;
	}

	public MoovieDto(Moovie moovie) {
		id = moovie.getId();
		title = moovie.getTitle();
		score = moovie.getScore();
		count = moovie.getCount();
		image = moovie.getImage();
	}

}
