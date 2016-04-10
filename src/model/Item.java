package model;

public class Item {
	private String serialNumber;
	private String name;
	private String type;
	private double purchasePrice;
	private double sellPrice;
	private int quantity;
	private Customer provider;

	public Item() {

	}

	public Item(String serialNumber, String name, String type, double purchasePrice, double sellPrice, int quantity,
			Customer provider) {
		this.serialNumber = serialNumber;
		this.name = name;
		this.type = type;
		this.purchasePrice = purchasePrice;
		this.sellPrice = sellPrice;
		this.quantity = quantity;
		this.provider = provider;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public double getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Customer getProvider() {
		return provider;
	}

	public void setProvider(Customer provider) {
		this.provider = provider;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Item [serialNumber=" + serialNumber + ", name=" + name + ", type=" + type + ", purchasePrice="
				+ purchasePrice + ", sellPrice=" + sellPrice + ", quantity=" + quantity + ", provider=" + provider
				+ "]";
	}

}
