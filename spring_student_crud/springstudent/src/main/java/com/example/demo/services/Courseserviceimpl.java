package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;
import com.example.demo.repository.Courserepository;

@Service
public class Courseserviceimpl implements Courseservice {
	@Autowired
	public Courserepository cr;
	public Courseserviceimpl(Courserepository cr) {
		super();
		this.cr = cr;
	}

	@Override
	public String addcourse(Course c) {
		// TODO Auto-generated method stub
		cr.save(c);
		return "created";
	}

	@Override
	public List<Course> getcourse() {
		// TODO Auto-generated method stub
		List<Course> c=cr.findAll();
		return c;
	}

	@Override
	public String updcourse(Course c) {
		// TODO Auto-generated method stub
		cr.save(c);
		return "updated";
	}

	@Override
	public String delcourse(int cid) {
		// TODO Auto-generated method stub
		cr.deleteById(cid);
		return "deleted";
	}

}
