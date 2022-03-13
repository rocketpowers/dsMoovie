package com.packages.dsmoovie.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packages.dsmoovie.dto.MoovieDto;
import com.packages.dsmoovie.entities.Moovie;
import com.packages.dsmoovie.repositories.MoovieRepository;

@Service
public class MoovieService {

	@Autowired
	private MoovieRepository repository;

	@Transactional(readOnly = true)
	public Page<MoovieDto> findAll(Pageable pageable) {
		Page<Moovie> result = repository.findAll(pageable);
		Page<MoovieDto> page = result.map(x -> new MoovieDto(x));
		return page;
	}

	@Transactional(readOnly = true)
	public MoovieDto findById(Long id) {
		Moovie result = repository.findById(id).get();
		MoovieDto dto = new MoovieDto(result);
		return dto;

	}

}
