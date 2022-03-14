package com.packages.dsmoovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.packages.dsmoovie.dto.MoovieDto;
import com.packages.dsmoovie.services.MoovieService;

@RestController
@RequestMapping(value="/moovies")
public class MoovieController {
	
	
	@Autowired 
	private MoovieService service;
	
	
	@GetMapping
	public Page<MoovieDto>findAll(Pageable pageable){
		
		return service.findAll(pageable);
		
	}
	
	@GetMapping(value = "/{id}")
	public MoovieDto findById(@PathVariable Long  id){
		
		return service.findById(id);
		
	}
}
