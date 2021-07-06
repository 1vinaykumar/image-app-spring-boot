package com.hackerearth.imageapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackerearth.imageapp.entities.Image;

public interface ImageRepo extends JpaRepository<Image, Integer> {

}
