package com.bridgelabz.addressbookapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/addressbookservice")
public class AddressBookController {
	
	@GetMapping(value = { "", "/", "/get" })
	public ResponseEntity<String> getEmployeePayrollData() {
		return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<String> getEmployeePayrollData(@PathVariable("id") int id) {
		return new ResponseEntity<String>("Get Call Success for id: " + id, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<String> addEmployeePayrollData(@RequestBody String name) {
		return new ResponseEntity<String>("Created Address Book Contact Data for: " + name, HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateEmployeePayrollData(@PathVariable("id") int id) {
		return new ResponseEntity<String>("Updated Address Book Contact Data for id: " + id, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("id") int id) {
		return new ResponseEntity<String>("Delete Call Success for id: " + id, HttpStatus.OK);
	}
}
