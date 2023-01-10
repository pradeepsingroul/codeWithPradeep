package codeWithPk.model;

import org.springframework.stereotype.Component;

@Component
public class Gym {
	
	private int gymId;
	private String gym_Name;
	private int fee;
	public int getGymId() {
		return gymId;
	}
	public void setGymId(int gymId) {
		this.gymId = gymId;
	}
	public String getGym_Name() {
		return gym_Name;
	}
	public void setGym_Name(String gym_Name) {
		this.gym_Name = gym_Name;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Gym [gymId=" + gymId + ", gym_Name=" + gym_Name + ", fee=" + fee + "]";
	}
	public Gym(int gymId, String gym_Name, int fee) {
		super();
		this.gymId = gymId;
		this.gym_Name = gym_Name;
		this.fee = fee;
	}
	public Gym() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
