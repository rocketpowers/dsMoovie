package com.packages.dsmoovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packages.dsmoovie.dto.MoovieDto;
import com.packages.dsmoovie.dto.ScoreDto;
import com.packages.dsmoovie.entities.Moovie;
import com.packages.dsmoovie.entities.Score;
import com.packages.dsmoovie.entities.User;
import com.packages.dsmoovie.repositories.MoovieRepository;
import com.packages.dsmoovie.repositories.ScoreRepository;
import com.packages.dsmoovie.repositories.UserRepository;

@Service
public class ScoreService {

	@Autowired
	private MoovieRepository moovieRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ScoreRepository scoreRepository;

	@Transactional
	public MoovieDto saveScore(ScoreDto dto) {

		User user = userRepository.findByEmail(dto.getEmail());
		if (user == null) {
			user = new User();
			user.setEmail(dto.getEmail());
			user = userRepository.saveAndFlush(user);
		}

		Moovie moovie = moovieRepository.findById(dto.getMoovieId()).get();

		Score score = new Score();
		score.setMoovie(moovie);
		score.setUser(user);
		score.setValue(dto.getScore());
		
		score= scoreRepository.saveAndFlush(score);
		
		
		double sum=0.0;
		for (Score s : moovie.getScores()) {
			sum = sum +s.getValue();
		
		}
	
		double avg = sum /moovie.getScores().size();
		
		moovie.setScore(avg);
		moovie.setCount(moovie.getScores().size());
		
		moovie = moovieRepository.save(moovie);
		
		return new MoovieDto(moovie);
		
		
		
    	}
	}
