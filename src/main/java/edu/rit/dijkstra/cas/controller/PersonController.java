package edu.rit.dijkstra.cas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.rit.dijkstra.cas.model.Person;
import edu.rit.dijkstra.cas.service.PersonService;

@RestController
@RequestMapping("/api/v1/")
public class PersonController {
	
	@Autowired private PersonService personService;
	
	@RequestMapping(value="persons", method=RequestMethod.GET)
	public List<Person> getPersons() {
		return personService.getPersons();
	}
	
	@RequestMapping(value="person/{id}", method=RequestMethod.GET)
	public Person getPersonById(@PathVariable Long id) {
		return personService.getPersonById(id);
	}
}
