package edu.rit.dijkstra.cas.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long personId;
	private String firstName;
	private String lastName;
	
	public Person () {}
	
	public Person (Long personId) {
		this.personId = personId;
		this.firstName = "Unknown";
		this.lastName = "Uknown";
	}
	
	public Person(Long personId, String firstName, String lastName) {
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="person_id")
	public Long getPersonId() { return personId; }
	public void setPersonId(Long personId) { this.personId = personId; }
	
	@Column(name="first_name")
	public String getFirstName() { return firstName; }
	public void setFirstName(String firstName) { this.firstName = firstName; }
	
	@Column(name="last_name")
	public String getLastName() { return lastName; }
	public void setLastName(String lastName) { this.lastName = lastName; }

}
