package com.example.demo.services;
import java.util.List;
import com.example.demo.entity.Studentdetails;
public interface Studentservice  {
public String savestudent(Studentdetails s);
public List<Studentdetails> getstudent();
public String updatestudent(Studentdetails s);
public String deletestudent(int sid);
}
