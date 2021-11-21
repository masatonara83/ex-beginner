package com.example.domain;

public class Item {

	//商品名
	private String name;
	//商品価格
	private Integer price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "item [name=" + name + ", price=" + price + "]";
	}
	
}
