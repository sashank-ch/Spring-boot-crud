package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Course;

public interface Courseservice {
public String addcourse(Course c);
public List<Course> getcourse();
public String updcourse(Course c);
public String delcourse(int cid);
}
