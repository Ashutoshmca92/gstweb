package com.ayasyaGst.itemController;

import java.util.List;

//import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ayasyaGst.item.Item;
import com.ayasyaGst.itemRepository.ItemRepository;

@RestController
@RequestMapping("/api")
public class ItemController {
	@Autowired
	ItemRepository itemRepository;
	
	@RequestMapping(value="/items" ,method=RequestMethod.POST)
	public ResponseEntity<String> createdNewItem (@RequestBody @Valid Item items){
		
		//created one object of Item class
		Item item = new Item();
		item.setName(items.getName());
		item.setDescription(items.getDescription());
		item.setPrice(items.getPrice());
		item.setCreatedAt(items.getCreatedAt());
		item.setUpdatedAt(items.getUpdatedAt());
		itemRepository.save(item);
		
		return  new ResponseEntity<String>("Success", HttpStatus.OK);
		
	}
	
	 @RequestMapping(value="/allItem", method=RequestMethod.GET)
	  public  List<Item>  getAllItem(){
		 return  itemRepository.findAll();
	 }
	/*
	 * @RequestMapping(value="/item/{id}" , method=RequestMethod) public
	 */
	 
	

}
