package edu.rit.dijkstra.cas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.rit.dijkstra.cas.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
