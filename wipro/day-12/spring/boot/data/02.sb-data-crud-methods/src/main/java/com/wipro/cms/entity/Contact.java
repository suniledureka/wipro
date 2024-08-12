package com.wipro.cms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "CONTACT_MASTER")
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Contact {
	@Id
	@Column(name = "CONTACT_ID")
	private Integer contactId;

	@Column(name = "CONTACT_NAME")
	private String contactName;

	@Column(name = "CONTACT_NO")
	private Long contactNumber;

	@Override
	public String toString() {
		return String.format("Contact [%-6d %-20s %10d]", contactId, contactName, contactNumber);
	}
}
