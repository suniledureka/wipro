package com.wipro.hibernate.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "student")

/*
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
*/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	@Column(name = "studid")
	private Integer studentId;
	
	@Column(name = "sname")
	private String studentName;
	
	@Column(name = "mobile")
	private String studentMobile;
	
	@Override
	public String toString() {
		return String.format("Student [ %-4d   %-20s   %-10s ]", studentId, studentName, studentMobile);
	}	
}
