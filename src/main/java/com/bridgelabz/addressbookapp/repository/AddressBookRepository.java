package com.bridgelabz.addressbookapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.addressbookapp.model.AddressBookData;

@Repository
public interface AddressBookRepository extends CrudRepository<AddressBookData, Long> {

}
