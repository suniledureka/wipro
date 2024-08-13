package com.wipro.data.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Person {
	@EmbeddedId
	private PersonPK personPk;
	
	private String name;
	private String email;
	private String gender;

}
