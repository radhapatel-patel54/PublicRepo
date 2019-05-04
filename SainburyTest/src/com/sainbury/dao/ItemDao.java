package com.sainbury.dao;

import java.util.Arrays;
import java.util.List;

import com.sainbury.model.Item;

public class ItemDao {
	
	List<Item> itemListResult;
	Item item1 = new Item("1", "Sainsbury’s Strawberries", "30.00", 1.75, "400g Strawberry");
	Item item2 = new Item("2", "Sainsbury’s Blueberries", "57.00", 1.75, "200g Blueberry");
	Item item3 = new Item("3", "Sainsbury’s Raspberries", "52.00", 1.75, "225g Raspberry");
	Item item4 = new Item("4", "Sainsbury’s Blackberries"," 43.00", 1.5, "150g Blackberry");
	List<Item> itemList = Arrays.asList(item1, item2, item3, item4);
	
	
	public List<Item> getAllProducts(){
		return itemList;
	}

}
