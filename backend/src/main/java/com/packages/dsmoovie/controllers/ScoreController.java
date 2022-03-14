package com.packages.dsmoovie.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.packages.dsmoovie.dto.MoovieDto;
import com.packages.dsmoovie.dto.ScoreDto;
import com.packages.dsmoovie.services.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

	@Autowired
	private ScoreService service;
	
	@PutMapping
	public MoovieDto saveScore(@RequestBody ScoreDto dto) {

		MoovieDto moovieDto = service.saveScore(dto);  
		return moovieDto;
	}

}
