package com.bridgelabz.addressbookapp.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.exceptions.AddressBookException;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.repository.AddressBookRepository;

@Service
public class AddressBookService implements IAddressBookService {

	@Autowired
	private AddressBookRepository addressBookRepository;

	@Override
	public List<AddressBookData> getAddressBookContactData() {
		return (List<AddressBookData>) addressBookRepository.findAll();
	}

	@Override
	public AddressBookData getAddressBookContactDataById(Long id) {		
			AddressBookData contactData = addressBookRepository.findById(id)
											.orElseThrow(() -> new AddressBookException("Address Book Contact Not Found"));
			return contactData;	
	}

	@Override
	public AddressBookData createAddressBookContactData(AddressBookDTO addressBookDTO) {		
		AddressBookData contactData = null;
		contactData = new AddressBookData(addressBookDTO);
		return addressBookRepository.save(contactData);
	}

	@Override
	public AddressBookData updateAddressBookContactData(Long id, AddressBookDTO addressBookDTO) {
		AddressBookData contactData = this.getAddressBookContactDataById(id);
		BeanUtils.copyProperties(addressBookDTO, contactData);
		return addressBookRepository.save(contactData);
	}

	@Override
	public void deleteAddressBookContactData(Long id) {
		if(this.getAddressBookContactDataById(id) != null)
			addressBookRepository.deleteById(id);
	}
}
