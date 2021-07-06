package com.hackerearth.imageapp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hackerearth.imageapp.entities.Image;
import com.hackerearth.imageapp.repos.ImageRepo;

@RestController
@CrossOrigin(origins = {"https://image-app-tm.web.app","http://localhost:3000"})
public class ImageController {
	
	private final ImageRepo imageRepo;
	
	public ImageController(ImageRepo imageRepo) {
		this.imageRepo = imageRepo;
	}
	
	@GetMapping("/")
	public List<Image> getImages() {
		return this.imageRepo.findAll();
	}
	
	@PostMapping("/")
	public Image addImage(@RequestBody Image image) {
		this.imageRepo.save(image);
		return image;
	}
}
