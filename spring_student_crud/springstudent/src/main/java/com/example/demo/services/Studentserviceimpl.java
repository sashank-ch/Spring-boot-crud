package com.example.demo.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Studentdetails;
import com.example.demo.repository.Studentrepository;
@Service
public class Studentserviceimpl implements Studentservice{
	@Autowired
public  Studentrepository sr;
	public Studentserviceimpl(Studentrepository sr) {
	super();
	this.sr = sr;
}

	@Override
	public String savestudent(Studentdetails s) {
		// TODO Auto-generated method stub
		sr.save(s);
		return "created";
	}

	@Override
	public List<Studentdetails> getstudent() {
		// TODO Auto-generated method stub
		List<Studentdetails> sl=sr.findAll();
		return sl;
	}

	@Override
	public String updatestudent(Studentdetails s) {
		// TODO Auto-generated method stub
		sr.save(s);
		return "updated";
	}

	@Override
	public String deletestudent(int sid) {
		// TODO Auto-generated method stub
		sr.deleteById(sid);
		return "deleted";
	}

}
