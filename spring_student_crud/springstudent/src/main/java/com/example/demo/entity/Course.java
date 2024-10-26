package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;
	@Column
	private String cname;
	@Column
	private String ccode;
	@OneToOne(mappedBy="cid")
	private Studentdetails studentdetails;
	private Course() {
		
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", ccode=" + ccode + "]";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCcode() {
		return ccode;
	}
	public void setCcode(String ccode) {
		this.ccode = ccode;
	}
	public Course(int cid, String cname, String ccode) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ccode = ccode;
	}
}

