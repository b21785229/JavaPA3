import java.util.*;

public class ManageOrders implements OrderDAO{
	ArrayList<Order> orderList = new ArrayList<Order>();
	
	public Order createOrder(int orderID, int customerID) {
		Order newOrder = new Order();
		newOrder.setOrderID(orderID);
		newOrder.setOrderCustomer(customerID);
		return newOrder;
	}
	
	public void addOrder(Order order) {
		orderList.add(order);
	}
	
	public void deleteOrder(int i) {
		orderList.remove(i);
	}
	
	public ArrayList<Order> getAllOrders(){
		return orderList;
	}
	
}
