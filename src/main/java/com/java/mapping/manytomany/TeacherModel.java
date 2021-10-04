package com.java.mapping.manytomany;

import java.util.List;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Teacher")
public class TeacherModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teacherid;
	private String name;
	private String address;

	@Lob
	private byte[] data;

	@ManyToMany
	private Library library;

	public TeacherModel() {

	}

	public TeacherModel(String name, String address, byte[] data, Library library) {
		super();
		this.name = name;
		this.address = address;
		this.data = data;
		this.library = library;
	}

	public int getTeacherid() {
		return teacherid;
	}

	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}



	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}
}
