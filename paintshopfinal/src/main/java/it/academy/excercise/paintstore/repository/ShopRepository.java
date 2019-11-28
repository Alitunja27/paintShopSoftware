package it.academy.excercise.paintstore.repository;

import org.springframework.data.repository.CrudRepository;

import it.academy.excercise.paintstore.domain.Shop;

public interface ShopRepository extends CrudRepository<Shop, String> { //Shop because is the domain class of the repository and String
																	   //because is the main key class

	
	
	
	
}
