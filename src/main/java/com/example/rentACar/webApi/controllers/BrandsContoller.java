package com.example.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rentACar.business.abstracts.BrandService;
import com.example.rentACar.entites.concretes.Brand;

@RestController
@RequestMapping
public class BrandsContoller {

	private BrandService brandService;

	public BrandsContoller(BrandService brandService) {
		super();
		this.brandService = brandService;
	}
	
	@GetMapping("/getAll")
	
	public List<Brand> getAll(){
		return brandService.getAll();
		
	}
	
}
