package online_bookstore.models;

import java.util.ArrayList;
import java.util.List;

import online_bookstore.items.Item;

public class Order {

	private Customer customer;
	private List<Item> items;

	public Order() {
		items = new ArrayList<Item>();
	}

	public Order(List<Item> items) {
		this.items = items;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

}
