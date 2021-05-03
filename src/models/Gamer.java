package models;

public class Gamer {
	private int id;
	private String firstName;
	private String surName;
	private String birthDay;
	private String nationalityIdentity;
	
	public Gamer(int id, String firstName, String surName, String birthDay, String nationalityIdentity) {
		this.id = id;
		this.firstName = firstName;
		this.surName = surName;
		this.birthDay = birthDay;
		this.nationalityIdentity = nationalityIdentity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getNationalityIdentity() {
		return nationalityIdentity;
	}

	public void setNationalityIdentity(String nationalityIdentity) {
		this.nationalityIdentity = nationalityIdentity;
	}
	
	
}
