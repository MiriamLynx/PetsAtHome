package com.demo.model;

import java.util.Date;

public class Pet {

    private String code;
    private String name;
    private PetState state;
    private Date birthday;
    private Integer visits;
    private Owner owner;
    private PetSpecies species;
    

	public Pet(String code, String name, PetState state, Date birthday, Integer visits, Owner owner, PetSpecies species) {
    	this.code = code;
    	this.name = name;
    	this.state = state;
    	this.birthday = birthday;
    	this.visits = visits;
    	this.owner = owner;
    	this.species = species;
    }
    
	public PetSpecies getSpecies() {
		return species;
	}
	
	public String getSpeciesLabel() {
		switch(species) {
		case CAT:
			return "Gato: Felis silvestris catus";
		case DOG:
			return "Perro: Canis lupus familiaris";
		default:
			return "Desconocido";
		}
	}
	
	public void setSpecies(PetSpecies species) {
		this.species = species;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PetState getState() {
		return state;
	}
	public String getStateLabel() {
		switch(state) {
		case IN:
			return "INGRESADO";
		case OUT:
			return "ALTA";
		default:
			return "DESCONOCIDO";
		}
	}
	public void setState(PetState state) {
		this.state = state;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getVisits() {
		return visits;
	}
	public void setVisits(Integer visits) {
		this.visits = visits;
	}
	public Owner getOwner() {
		return this.owner;
	}
	public String getOwnerName() {
		return owner.getLastNames() + ", " + owner.getName();
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}


}
