package com.capgem.dev.spring.xmlconstr;

import java.util.List;

public class Tiger {
	
	
	private int id;
	private List<String> name;
	PinkPanther pink;
	public Tiger(int id, List<String> name) {
		super();
		this.id = id;
		this.name = name;
	
	}
	@Override
	public String toString() {
		return "Tiger [id=" + id + ", name=" + name + "]";
	}
	

}
