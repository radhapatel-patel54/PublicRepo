package com.sainbury.model;

import org.codehaus.jackson.map.annotate.JsonSerialize;

public class Item {
	private String code;
	private String title;

	//@JsonInclude(Include.NON_EMPTY)
	@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL) 
	private String kcal_per_100g;

	private double unit_price;
	private String description;

	public Item() {
		// super();
	}

	public Item(String code, String title, String kcal_per_100g, double unit_price, String description) {
		super();
		this.code = code;
		this.title = title;
		this.kcal_per_100g = kcal_per_100g;
		this.unit_price = unit_price;
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getKcal_per_100g() {
		return kcal_per_100g;
	}

	public void setKcal_per_100g(String kcal_per_100g) {
		this.kcal_per_100g = kcal_per_100g;
	}

	public double getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(double unit_price) {
		this.unit_price = unit_price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
