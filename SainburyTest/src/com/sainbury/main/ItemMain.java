package com.sainbury.main;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

import com.sainbury.model.Results;
import com.sainbury.service.ItemService;

public class ItemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ItemService itemService = new ItemService();
		String jsonStr;

		Results result = itemService.getResult();
	
		
		//result.getItems().stream().forEach(
		//		item -> item.setDescription(item.getDescription().substring(0, item.getDescription().indexOf("\n"))));
		

		ObjectMapper Obj = new ObjectMapper();
		try {
			jsonStr = Obj.writerWithDefaultPrettyPrinter().writeValueAsString(result);
			System.out.println(jsonStr);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
