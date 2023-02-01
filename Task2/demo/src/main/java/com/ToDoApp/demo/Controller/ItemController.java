package com.ToDoApp.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ToDoApp.demo.Entity.Item;
import com.ToDoApp.demo.Service.ItemService;

@Controller
@ResponseBody
public class ItemController {
	
	@Autowired
	public ItemService itemservice;

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method = RequestMethod.GET,value="/createItem/{id}/{itemName}")
	public String createItem(@PathVariable int id, @PathVariable String itemName) {
		
		itemservice.createItem(id, itemName);
		return "Item created";
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method = RequestMethod.GET,value="/getItem/{id}")
	public Item getitem(@PathVariable int id) {
		
		return itemservice.getItem(id);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method = RequestMethod.GET,value="/deleteItem/{id}")
	public String deleteItem(@PathVariable int id) {
    	// getItem
        return itemservice.deleteItem(id);
	}
}
