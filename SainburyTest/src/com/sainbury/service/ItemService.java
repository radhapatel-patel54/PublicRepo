package com.sainbury.service;

import java.util.List;

import com.sainbury.dao.ItemDao;
import com.sainbury.model.Item;
import com.sainbury.model.Results;
import com.sainbury.model.Total;

public class ItemService {

	ItemDao itemDao = new ItemDao();

	public Results getResult() {

		// getting list of objects
		List<Item> itemList = itemDao.getAllProducts();

		// to check if the description is multi line . If yes then set first line only
		for (Item item : itemList) {
			if (item.getDescription().split("\n").length > 1) {
				item.setDescription(item.getDescription().substring(0, item.getDescription().indexOf("\n")));
			}
		}

		// calculating gross for each product
		double gross = itemList.stream().mapToDouble(item -> item.getUnit_price()).sum();
		// calculating vat of 20%
		double vat = gross * 0.2;

		return new Results(itemList, new Total(gross, vat));
	}

}
