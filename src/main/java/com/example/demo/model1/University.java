package com.example.demo.model1;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
@Data
@Entity
public class University {
@Id
private int id;
private String name;
private String totalclgs;
public int getId() {
	return id;
}
public void setId(int Id) {
	this.id= Id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public String getTotalclgs() {
	return totalclgs;
}
public void setTotalclgs(String totalclgs) {
	this.totalclgs=totalclgs;
}
}
