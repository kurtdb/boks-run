package be.boks.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class Club implements Serializable {

	private static final long serialVersionUID = -1535672487981334177L;

	@Id
	private Long id;
	
	private String name;
	
	private String type = "club";
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
