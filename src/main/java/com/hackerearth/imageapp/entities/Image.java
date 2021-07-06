package com.hackerearth.imageapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Image {
	@GeneratedValue
	@Id
	private int id;
	private String imgName;
	private String imgURL;
	private String imgDetails;
}
