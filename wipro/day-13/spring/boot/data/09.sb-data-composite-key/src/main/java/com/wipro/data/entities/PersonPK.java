package com.wipro.data.entities;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class PersonPK {
	 private Integer personId;
	 private String passportNum;
}
