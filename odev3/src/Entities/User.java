package Entities;

import java.time.LocalDate;
import java.time.temporal.Temporal;

public class User {
	int id;
	String Tc;
	String firstName;
	String lastName;
	LocalDate birthYear;
	
	
	public User() {
		super();
	}
	public User(int id, String tc, String firstName, String lastName, LocalDate birthYear) {
		super();
		this.id = id;
		this.Tc = tc;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTc() {
		return Tc;
	}
	public void setTc(String tc) {
		Tc = tc;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Temporal getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(LocalDate birthYear) {
		this.birthYear = birthYear;
	}
	
}
