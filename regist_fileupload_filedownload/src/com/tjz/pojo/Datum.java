package com.tjz.pojo;

public class Datum {
	private int id;
	private String fname;
	private int fcount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getFcount() {
		return fcount;
	}
	public void setFcount(int fcount) {
		this.fcount = fcount;
	}
	@Override
	public String toString() {
		return "Datum [id=" + id + ", fname=" + fname + ", fcount=" + fcount + "]";
	}
	
	
	
}
