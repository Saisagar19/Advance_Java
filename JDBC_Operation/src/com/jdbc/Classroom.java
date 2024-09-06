package com.jdbc;

public class Classroom {
	
	int clsId;
	String clsName;
	
	public Classroom() {
		
	}

	public Classroom(int clsId, String clsName) {
		super();
		this.clsId = clsId;
		this.clsName = clsName;
	}

	@Override
	public String toString() {
		return "Classroom [clsId=" + clsId + ", clsName=" + clsName + "]";
	}
	

}
