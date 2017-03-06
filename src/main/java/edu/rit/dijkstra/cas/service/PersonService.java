package edu.rit.dijkstra.cas.service;

import java.util.List;

import edu.rit.dijkstra.cas.model.Person;

public interface PersonService {
	List<Person> getPersons();
	Person getPersonById(Long id);
}
