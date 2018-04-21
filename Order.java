import java.util.*;
public class Order {

	private int orderID;
	private int orderCustomer;
	private double checkSum = 0;
	private int drinks = 0;
	ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
	
	
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getOrderCustomer() {
		return orderCustomer;
	}
	public void setOrderCustomer(int orderCustomer) {
		this.orderCustomer = orderCustomer;
	}
	public void addPizza(Pizza newPizza) {
		pizzas.add(newPizza);
	}
	public double getPrice() {
		return checkSum;
	}
	public int getDrinks() {
		return drinks;
	}
	public void addDrink() {
		drinks++;
	}
	public void calculateCheckSum(double price) {
		checkSum += price;
	}
	
}
