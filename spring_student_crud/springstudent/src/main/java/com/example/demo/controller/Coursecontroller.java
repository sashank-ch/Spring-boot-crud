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

import com.example.demo.entity.Course;
import com.example.demo.services.Courseserviceimpl;

@RestController
@RequestMapping("/course")
public class Coursecontroller {
	@Autowired
	public Courseserviceimpl cs;

	public Coursecontroller(Courseserviceimpl cs) {
		super();
		this.cs = cs;
	}
	@PostMapping("/addcourse")
public String addcourse(@RequestBody Course c) {
	cs.addcourse(c);
	return "course created";
}
	@GetMapping("/getcourse")
	public List<Course> getcourse(){
		List<Course> c=cs.getcourse();
		return c;
	}
	@PutMapping("/updcourse")
	public String updcourse(@RequestBody Course c) {
		cs.updcourse(c);
		return "course updated";
	}
	@DeleteMapping("/delcourse")
	public String delcourse(@PathVariable("cid") int cid) {
		cs.delcourse(cid);
		return "course deleted";
	}
}
