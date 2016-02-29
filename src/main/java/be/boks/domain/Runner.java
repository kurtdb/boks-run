package be.boks.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;

public class Runner implements Serializable {
	
	private static final long serialVersionUID = 2530453437671327658L;

	@Id
	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	private Integer age;
	
	private LocalDate entryDate;
	
	private String address;
	
	private Long postalCode;
	
	private String city;
	
	private Club runningClub;
	
	private List<Category> categories;
	
	private String emailAddress;
	
	private Gender gender;
	
	private List<Time> times;
	
	private String type = "runner";
	
	private boolean boksLid;
	
	private boolean stofwisselingsZiekte;
	
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
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
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
	
	public Club getRunningClub() {
		return runningClub;
	}
	
	public void setRunningClub(Club runningClub) {
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isBoksLid() {
		return boksLid;
	}

	public void setBoksLid(boolean boksLid) {
		this.boksLid = boksLid;
	}

	public boolean isStofwisselingsZiekte() {
		return stofwisselingsZiekte;
	}

	public void setStofwisselingsZiekte(boolean stofwisselingsZiekte) {
		this.stofwisselingsZiekte = stofwisselingsZiekte;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(this.address);
		builder.append(this.categories);
		builder.append(this.city);
		builder.append(this.age);
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
			builder.append(this.age, runner.age);
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
		builder.append("dateOfBirth", this.age);
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
