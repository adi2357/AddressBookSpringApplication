package com.bridgelabz.addressbookapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

import lombok.Data;

@Entity
@Table(name = "CONTACTS")
public @Data class AddressBookData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name")
	private String fullName;
	@Column
	private String address;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String zip;
	@Column(name = "phone_number")
	private String phoneNumber;
	
	public AddressBookData() {
	}
	
	public AddressBookData(AddressBookDTO addressBookDTO) {
		this.fullName = addressBookDTO.fullName;
		this.address = addressBookDTO.address;
		this.city = addressBookDTO.city;
		this.state = addressBookDTO.state;
		this.zip = addressBookDTO.zip;
		this.phoneNumber = addressBookDTO.phoneNumber;
	}	
}
