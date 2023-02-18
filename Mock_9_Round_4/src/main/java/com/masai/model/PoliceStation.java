package com.masai.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class PoliceStation {
	
	@Id
	private Integer stationId;
	
	private String address;
	
	@OneToOne
	private Police officerIncharge;
	
	@OneToMany
	private List<Police> constables;
	
	@OneToMany
	private List<FIR> firList;

	public Integer getStationId() {
		return stationId;
	}

	public void setStationId(Integer stationId) {
		this.stationId = stationId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Police getOfficerIncharge() {
		return officerIncharge;
	}

	public void setOfficerIncharge(Police officerIncharge) {
		this.officerIncharge = officerIncharge;
	}

	public List<Police> getConstables() {
		return constables;
	}

	public void setConstables(List<Police> constables) {
		this.constables = constables;
	}

	public List<FIR> getFirList() {
		return firList;
	}

	public void setFirList(List<FIR> firList) {
		this.firList = firList;
	}

	@Override
	public String toString() {
		return "PoliceStation [stationId=" + stationId + ", address=" + address + ", officerIncharge=" + officerIncharge
				+ ", constables=" + constables + ", firList=" + firList + "]";
	}

	public PoliceStation(Integer stationId, String address, Police officerIncharge, List<Police> constables,
			List<FIR> firList) {
		super();
		this.stationId = stationId;
		this.address = address;
		this.officerIncharge = officerIncharge;
		this.constables = constables;
		this.firList = firList;
	}

	public PoliceStation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
