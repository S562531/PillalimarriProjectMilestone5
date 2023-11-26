package com.RahulClasses.DMS.repository;



import java.util.List;

/**
 * @author S555479 - Rahul Datta Bitra
 */

import org.springframework.data.repository.CrudRepository;

import com.RahulClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);	

}
