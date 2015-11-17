package be.boks.domain;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

public class Runner {
	@Id
	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	private LocalDate dateOfBirth;
	
	private LocalDate entryDate;
	
	private String address;
	
	private Long postalCode;
	
	private String city;
	
	private String runningClub;
	
	private Category category;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
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
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public LocalDate getEntryDate() {
		return entryDate;
	}
	
	public void setEntryDate(LocalDate entryDate) {
		this.entryDate = entryDate;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Long getPostalCode() {
		return postalCode;
	}
	
	public void setPostalCode(Long postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getRunningClub() {
		return runningClub;
	}
	
	public void setRunningClub(String runningClub) {
		this.runningClub = runningClub;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
}
