package model;

import java.util.ArrayList;

public class Bill {
	private String billNumber;
	private Customer customer;
	private ArrayList<Item> listItem;
	private double totalPrice;
	private int type;

	public Bill() {

	}
	
	public Bill(String billNumber, Customer customer, ArrayList<Item> listItem, double totalPrice, int type) {
		this.billNumber = billNumber;
		this.customer = customer;
		this.listItem = listItem;
		this.totalPrice = totalPrice;
		this.type = type;
	}

	public String getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ArrayList<Item> getListItem() {
		return listItem;
	}

	public void setListItem(ArrayList<Item> listItem) {
		this.listItem = listItem;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
