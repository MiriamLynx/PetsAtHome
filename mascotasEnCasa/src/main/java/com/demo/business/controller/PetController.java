package com.demo.business.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.model.Pet;
import com.demo.persistence.PetRepository;

@Controller
public class PetController {

    private PetRepository repository = new PetRepository();
    
    @RequestMapping(path = "/home", produces = "application/json")
    String findAll(Model model) {
    	model.addAttribute("pets", processPetData(repository.getPets()));
    	return "home";
    }
    
    @RequestMapping(value = "/home", method=RequestMethod.POST)
    String processForm(@ModelAttribute(value="petCode") String petCode, Model model) {
    	model.addAttribute("pet", repository.findOnde(petCode));
    	return "details";
    }
    
    private List<Pet> processPetData(Map<String, Pet> petMap){
    	List<Pet> pets = new ArrayList<Pet>();
    	for (Entry<String, Pet> p : petMap.entrySet()) {
    		pets.add(p.getValue());
    	}
    	return pets;
    }

}
