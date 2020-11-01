package Model;

public class Service {
	
	private String name;
	private double price;
	private int quantity;
	private double bill;
	private User user;
public Service() {}
public Service(String name, double price, int quantity) {
	this.setName(name);
	this.setPrice(price);
	this.setQuantity(quantity);
	this.bill=price*quantity;
}
public Service(User user,String name, double price, int quantity) {
	this.setName(name);
	this.setPrice(price);
	this.setQuantity(quantity);
	this.bill=price*quantity;
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
}