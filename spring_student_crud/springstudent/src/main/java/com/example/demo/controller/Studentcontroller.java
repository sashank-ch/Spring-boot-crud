package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Studentdetails;
import com.example.demo.services.Studentserviceimpl;
@RestController
@RequestMapping("/Student")
public class Studentcontroller  {
@Autowired
public Studentserviceimpl si;

public Studentcontroller(Studentserviceimpl si) {
	super();
	this.si = si;
}
@PostMapping("/addstudent")
public String savestudent(@RequestBody Studentdetails s) {
	si.savestudent(s);
	return "Student created";
}
@GetMapping("/getstudent")
public List<Studentdetails> getstudent(){
	List<Studentdetails> sl=si.getstudent();
	return sl;
}
@PutMapping("/updatestudent")
public String updatestudent(@RequestBody Studentdetails s) {
	si.updatestudent(s);
	return "updated";
}
@DeleteMapping("/deletestudent/{sid}")
public String deletestudent(@PathVariable("sid") int sid) {
	si.deletestudent(sid);
	return "deleted";
}
}
