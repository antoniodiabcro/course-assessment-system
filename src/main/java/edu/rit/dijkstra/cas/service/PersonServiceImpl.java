package edu.rit.dijkstra.cas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.rit.dijkstra.cas.model.Person;
import edu.rit.dijkstra.cas.repository.PersonRepository;

@Service("personService")
public class PersonServiceImpl implements PersonService {
	
	@Autowired private PersonRepository personRepository;
	
	@Override
	public List<Person> getPersons() {
		return personRepository.findAll();
	}

	@Override
	public Person getPersonById(Long id) {
		return personRepository.findOne(id);
	}

}
