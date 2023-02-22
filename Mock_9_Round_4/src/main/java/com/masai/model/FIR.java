package com.masai.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class FIR {
	
	@Id
	private Integer firId;
	
	private String crimeDetails;
	
	private LocalDateTime timeStamp;
	
	private boolean isOpen;
	
	@OneToOne
	private User applicant;
	
	@OneToOne
	private Police officer;
	
	@OneToOne
	private PoliceStation policeStation;
	
	@OneToMany
	private List<User> criminals;

	public Integer getFirId() {
		return firId;
	}

	public void setFirId(Integer firId) {
		this.firId = firId;
	}

	public String getCrimeDetails() {
		return crimeDetails;
	}

	public void setCrimeDetails(String crimeDetails) {
		this.crimeDetails = crimeDetails;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public User getApplicant() {
		return applicant;
	}

	public void setApplicant(User applicant) {
		this.applicant = applicant;
	}

	public Police getOfficer() {
		return officer;
	}

	public void setOfficer(Police officer) {
		this.officer = officer;
	}

	public PoliceStation getPoliceStation() {
		return policeStation;
	}

	public void setPoliceStation(PoliceStation policeStation) {
		this.policeStation = policeStation;
	}

	public List<User> getCriminals() {
		return criminals;
	}

	public void setCriminals(List<User> criminals) {
		this.criminals = criminals;
	}

	@Override
	public String toString() {
		return "FIR [firId=" + firId + ", crimeDetails=" + crimeDetails + ", timeStamp=" + timeStamp + ", isOpen="
				+ isOpen + ", applicant=" + applicant + ", officer=" + officer + ", policeStation=" + policeStation
				+ ", criminals=" + criminals + "]";
	}

	public FIR(Integer firId, String crimeDetails, LocalDateTime timeStamp, boolean isOpen, User applicant,
			Police officer, PoliceStation policeStation, List<User> criminals) {
		super();
		this.firId = firId;
		this.crimeDetails = crimeDetails;
		this.timeStamp = timeStamp;
		this.isOpen = isOpen;
		this.applicant = applicant;
		this.officer = officer;
		this.policeStation = policeStation;
		this.criminals = criminals;
	}

	public FIR(Integer firId, String crimeDetails, LocalDateTime timeStamp, boolean isOpen, User applicant,
			Police officer, PoliceStation policeStation) {
		super();
		this.firId = firId;
		this.crimeDetails = crimeDetails;
		this.timeStamp = timeStamp;
		this.isOpen = isOpen;
		this.applicant = applicant;
		this.officer = officer;
		this.policeStation = policeStation;
	}

	public FIR() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
