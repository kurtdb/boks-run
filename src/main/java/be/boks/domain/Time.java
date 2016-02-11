package be.boks.domain;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

public class Time {
	@Id
	private Long id;
	
	private LocalDateTime startTime;
	
	private LocalDateTime finishTime;
	
	private Category category;
	
	private String type = "time";
	
	public Long getId() {
		return id;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(LocalDateTime finishTime) {
		this.finishTime = finishTime;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
