package models;

public class Campaign {
	private int id;
	private String name;
	private double disCount;
	private boolean isActive;
	
	public Campaign(int id, String name, double disCount, boolean isActive) {
		this.id = id;
		this.name = name;
		this.disCount = disCount;
		this.isActive = isActive;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDisCount() {
		return disCount;
	}
	public void setDisCount(double disCount) {
		this.disCount = disCount;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}  
	
	
}
