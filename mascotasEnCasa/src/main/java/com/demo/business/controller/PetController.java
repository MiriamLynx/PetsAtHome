package com.demo.business.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.Pet;
import com.demo.persistence.PetRepository;

@Controller
public class PetController {

    private PetRepository repository = new PetRepository();
    
    @RequestMapping(path = "/home", produces = "application/json")
    String findAll(Model model) {
    	List<Pet> pets = new ArrayList<Pet>();
    	for (Entry<String, Pet> p : repository.getPets().entrySet()) {
    		pets.add(p.getValue());
    	}
    	model.addAttribute("pets", pets);
    	return "home";
    }
    
//    @RequestMapping(value = "/pets", method=RequestMethod.POST)
//    public String processForm(@ModelAttribute(value="searchInput") String searchInput, Model model) {
//    	model.addAttribute("books", repository.findAllThatMatches(searchInput));
//    	return "home";
//    }

}
