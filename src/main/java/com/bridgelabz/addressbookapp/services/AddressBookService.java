package com.bridgelabz.addressbookapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService{

	@Override
	public List<AddressBookData> getAddressBookContactData() {
		List<AddressBookData> contactDataList = new ArrayList<>();
		contactDataList.add(new AddressBookData(1, new AddressBookDTO("Aditya Verma", "4/8, Sector-I, LDA Colony", "Lucknow",
				"Uttar Pradesh", "226014", "+91 8989041858")));
		return contactDataList;
	}

	@Override
	public AddressBookData getAddressBookDataContactById(int id) {
		AddressBookData contactData = null;
		contactData = new AddressBookData(id, new AddressBookDTO("Aditya Verma", "4/8, Sector-I, LDA Colony", "Lucknow",
				"Uttar Pradesh", "226014", "+91 8989041858"));
		return contactData;
	}

	@Override
	public AddressBookData createAddressBookContactData(AddressBookDTO addressBookDTO) {
		AddressBookData contactData = null;
		contactData = new AddressBookData(1, addressBookDTO);
		return contactData;
	}

	@Override
	public AddressBookData updateAddressBookContactData(int id, AddressBookDTO addressBookDTO) {
		AddressBookData contactData = null;
		contactData = new AddressBookData(id, addressBookDTO);
		return contactData;
	}

	@Override
	public void deleteAddressBookContactData(int id) {
				
	}

}
