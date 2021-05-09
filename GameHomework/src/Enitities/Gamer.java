package Enitities;

import java.time.LocalDate;

public class Gamer {
	
	private int id;
	private String gamerFirstName;
	private String gamerLastName;
	private LocalDate dateOfBirthday;
	private String nationalId;
	
	public Gamer() {
		
	}

	public Gamer(int id, String gamerFirstName, String gamerLastName, LocalDate dateOfBirthday, String nationalId) {
		this.id = id;
		this.gamerFirstName = gamerFirstName;
		this.gamerLastName = gamerLastName;
		this.dateOfBirthday = dateOfBirthday;
		this.nationalId = nationalId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGamerFirstName() {
		return gamerFirstName;
	}

	public void setGamerFirstName(String gamerFirstName) {
		this.gamerFirstName = gamerFirstName;
	}

	public String getGamerLastName() {
		return gamerLastName;
	}

	public void setGamerLastName(String gamerLastName) {
		this.gamerLastName = gamerLastName;
	}

	public LocalDate getDateOfBirthday() {
		return dateOfBirthday;
	}

	public void setDateOfBirthday(LocalDate dateOfBirthday) {
		this.dateOfBirthday = dateOfBirthday;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	
	
	
}
