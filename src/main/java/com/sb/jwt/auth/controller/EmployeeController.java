package com.sb.jwt.auth.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sb.jwt.auth.model.Employees;

@RestController
@CrossOrigin()
public class EmployeeController {

	@GetMapping("/emp/list")
	public ResponseEntity<?> getEmployeesList() {
		List<Employees> empList = new ArrayList<>();
		empList.add(new Employees(1, "emp1", "password1"));
		empList.add(new Employees(2, "emp2", "password2"));
		empList.add(new Employees(3, "emp3", "password3"));
		empList.add(new Employees(4, "emp4", "password4"));
		return new ResponseEntity<List<Employees>>(empList, HttpStatus.OK);
	}

	@GetMapping("/emp/{id}")
	public ResponseEntity<?> getEmployee(@PathVariable long id) {
		Employees emp = new Employees(1, "emp1", "password1");
		return new ResponseEntity<Employees>(emp, HttpStatus.OK);
	}

	@GetMapping("/greeting")
	public ResponseEntity<?> greeting() {
		return new ResponseEntity<String>("Welcome! I Love India", HttpStatus.OK);
	}
}