package com.bridgelabz.addressbookapp.services;

import java.util.List;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

public interface IAddressBookService {

	List<AddressBookData> getAddressBookContactData();

	AddressBookData getAddressBookContactDataById(Long id);

	AddressBookData createAddressBookContactData(AddressBookDTO addressBookDTO);

	AddressBookData updateAddressBookContactData(Long id, AddressBookDTO addressBookDTO);

	void deleteAddressBookContactData(Long id);
}
