package com.example.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.rentACar.dataAccess.abstracts.BrandRepository;
import com.example.rentACar.entites.concretes.Brand;

@Repository
public class InMemoryBrandRepository implements BrandRepository {

    List<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<>();

        brands.add(new Brand(1, "Range rover"));
        brands.add(new Brand(2, "Audi"));
        brands.add(new Brand(3, "Mercedes"));
        brands.add(new Brand(4, "Toyota"));
        brands.add(new Brand(5, "Fiat"));
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}