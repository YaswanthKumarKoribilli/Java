package com.ToDoApp.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ToDoApp.demo.Entity.Item;

@Repository
public interface ItemRepo extends JpaRepository<Item,Integer>{

//	@Query("select * from item where createdby = ":pe})
//	public List<Item> getAllItemsByCreatedPersonOrderByName(String personName)
} 
