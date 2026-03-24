package com.example.rentACar.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.rentACar.entites.concretes.Brand;

@Repository
public interface BrandRepository {
	
	List<Brand> getAll() ;

}
