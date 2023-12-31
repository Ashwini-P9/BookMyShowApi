package com.jsp.CloneAPIBookMyShow.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.jsp.CloneAPIBookMyShow.enums.ShowStatus;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class MoviewShow {
	@Id
	private long id;
	private LocalDateTime showStartTime;
	private LocalDateTime showEndTime;
	private ShowStatus showStatus;
	private  String showLocation;
	
	
	private long movieId;
	private String movieName;
    private String genre;
	private LocalTime movieDuration;
	private String movieDescription;
	private String movieLanguage;
	
	private long screenId;
	private String screeName;
	private double classicSeatPrice;
	private double goldSeatPrice;
	private double premiumSeatPrice;

	@ManyToOne
	@JoinColumn
	private Theatre theatre;
	

}
