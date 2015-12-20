package be.boks.domain;

import java.time.LocalDate;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
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
	
	private List<Category> categories;
	
	private String emailAddress;
	
	private Gender gender;
	
	private List<Time> times;
	
	public Long getId() {
		return id;
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
	
	public List<Category> getCategories() {
		return categories;
	}
	
	public void setCategories(List<Category> category) {
		this.categories = category;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public List<Time> getTimes() {
		return times;
	}

	public void setTimes(List<Time> times) {
		this.times = times;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(this.address);
		builder.append(this.categories);
		builder.append(this.city);
		builder.append(this.dateOfBirth);
		builder.append(this.emailAddress);
		builder.append(this.entryDate);
		builder.append(this.firstName);
		builder.append(this.gender);
		builder.append(this.lastName);
		builder.append(this.postalCode);
		builder.append(this.runningClub);
		builder.append(this.times);
		return builder.toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Runner) {
			EqualsBuilder builder = new EqualsBuilder();
			Runner runner = (Runner) obj;
			builder.append(this.address, runner.address);
			builder.append(this.categories, runner.categories);
			builder.append(this.city, runner.city);
			builder.append(this.dateOfBirth, runner.dateOfBirth);
			builder.append(this.emailAddress, runner.emailAddress);
			builder.append(this.entryDate, runner.entryDate);
			builder.append(this.firstName, runner.firstName);
			builder.append(this.gender, runner.gender);
			builder.append(this.lastName, runner.lastName);
			builder.append(this.postalCode, runner.postalCode);
			builder.append(this.runningClub, runner.runningClub);
			builder.append(this.times, runner.times);
			return builder.isEquals();
		}
		return false;
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this);
		builder.append("address", this.address);
		builder.append("category", this.categories);
		builder.append("city", this.city);
		builder.append("dateOfBirth", this.dateOfBirth);
		builder.append("emailAddress", this.emailAddress);
		builder.append("entryDate", this.entryDate);
		builder.append("firstName", this.firstName);
		builder.append("gender", this.gender);
		builder.append("lastName", this.lastName);
		builder.append("postalCode", this.postalCode);
		builder.append("runningClub", this.runningClub);
		builder.append("times", this.times);
		return builder.toString();
	}
}
