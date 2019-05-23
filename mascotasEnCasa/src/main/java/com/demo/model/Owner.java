package com.demo.model;


public class Owner {

    private String name;
    private String lastNames;
    
    public Owner(String name, String lastNames) {
    	this.name = name;
    	this.lastNames = lastNames;
    }
    
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Owner [name=");
		builder.append(name);
		builder.append(", lastNames=");
		builder.append(lastNames);
		builder.append("]");
		return builder.toString();
	}
	
	public String getLastNames() {
		return lastNames;
	}
	public void setLastNames(String lastNames) {
		this.lastNames = lastNames;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
