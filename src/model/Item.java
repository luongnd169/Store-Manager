package model;

public class Item {
	private String id;
	private String name;
	private double price;
	private int quantity;
	private Customer supplier;

	public Item() {

	}

	public Item(String id, String name, double price, int quantity, Customer supplier) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.supplier = supplier;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Customer getSupplier() {
		return supplier;
	}

	public void setSupplier(Customer supplier) {
		this.supplier = supplier;
	}

}
