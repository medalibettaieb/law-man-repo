package tn.gov.arp.lawman.services;

import java.util.List;

import javax.ejb.Local;

import tn.gov.arp.lawman.persistence.Todo;

@Local
public interface TodoServiceLocal {
	
	void create(Todo todo);
	List<Todo> findAll();

}
