package com.ToDoApp.demo.Service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ToDoApp.demo.Entity.Item;
import com.ToDoApp.demo.Repository.ItemRepo;

@Service
public class ItemService {
	
	@Autowired
	public ItemRepo itemrepo;
	
	public void createItem(int id, String itemName) {
		
		Logger logger = LoggerFactory.getLogger(ItemService.class);


        
		Item it = new Item();
		it.setItemId(id);
		it.setItemName(itemName);
		
		itemrepo.save(it);
		
		logger.info("Number {}", itemrepo.count());
    }
	
	
	public Item getItem(int id) {
		return itemrepo.findById(id).get();
	}
	
	public String deleteItem(int id) {
		itemrepo.deleteById(id);
		return "successfully deleted";
		
		
	}

	
	
}
