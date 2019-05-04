package  com.sainbury.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


public class Results {
	
	List<Item> items;
	Total total;
	
	
	
	public Results() {
		super();
	}
	public Results(List<Item> items, Total total) {
		super();
		this.items = items;
		this.total = total;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public Total getTotal() {
		return total;
	}
	public void setTotal(Total total) {
		this.total = total;
	}
	

}
