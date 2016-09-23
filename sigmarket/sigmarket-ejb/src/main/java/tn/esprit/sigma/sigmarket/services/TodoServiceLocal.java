package tn.esprit.sigma.sigmarket.services;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.sigma.sigmarket.persistence.Todo;

@Local
public interface TodoServiceLocal {
	
	void create(Todo todo);
	List<Todo> findAll();

}
