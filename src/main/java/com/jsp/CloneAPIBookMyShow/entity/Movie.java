package com.jsp.CloneAPIBookMyShow.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long movieId;
	private String movieName;
//	genresss
	private LocalDateTime movieDuration;
	private String moviedescription;
	private String language;
	@ManyToOne
	private ProductionHouse productionHouse;
	
}
