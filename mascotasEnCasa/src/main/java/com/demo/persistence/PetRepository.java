package com.demo.persistence;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.demo.model.Owner;
import com.demo.model.Pet;
import com.demo.model.PetSpecies;
import com.demo.model.PetState;

public class PetRepository {
	
	private Map<String, Pet> pets = new HashMap<String, Pet>();
	
	public PetRepository() {
		
		Owner owner1 = new Owner("Manuel", "García Pérez");
		String code1 = "0001";
		Pet pet1 = new Pet(code1, "Rufo", PetState.IN, new Date(), 5, owner1, PetSpecies.CAT);
		
		Owner owner2 = new Owner("María", "Pérez García");
		String code2 = "0002";
		Pet pet2 = new Pet(code2, "Lucy", PetState.IN, new Date(), 9, owner2, PetSpecies.DOG);
		
		Owner owner3 = new Owner("Manuel", "García Pérez");
		String code3 = "0003";
		Pet pet3 = new Pet(code3, "Pepo", PetState.OUT, new Date(), 9, owner3, PetSpecies.CAT);
		
		Owner owner4 = new Owner("Ana", "Aranda Alonso");
		String code4 = "0004";
		Pet pet4 = new Pet(code4, "Rayo", PetState.IN, new Date(), 9, owner4, PetSpecies.DOG);
		
		pets.put(code1, pet1);
		pets.put(code2, pet2);
		pets.put(code3, pet3);
		pets.put(code4, pet4);
	}

	public Map<String, Pet> getPets() {
		return pets;
	}

	public Pet findOnde(String petCode) {
		return this.pets.get(petCode);
	}
	
	

}
