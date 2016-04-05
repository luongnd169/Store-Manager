package model;

import java.util.ArrayList;

public class Bill {
	private String billNumber;
	private Customer customer;
	private ArrayList<Item> listItem;

	public Bill() {

	}
	
	public Bill(String billNumber, Customer customer, ArrayList<Item> listItem) {
		this.billNumber = billNumber;
		this.customer = customer;
		this.listItem = listItem;
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

}
