package com.example.demo.entity;
import jakarta.annotation.Generated;
import jakarta.persistence.*;
@Entity
public class Studentdetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
	@Column
private String name;
	@Column
private double percentage;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cousestd")
	private Course cid;
	public Studentdetails() {
		
	}
	public Studentdetails(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Studentdetails [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
	
}
