import java.util.ArrayList;

public interface OrderDAO {
	public Order getById(String ID);
	public void addOrder(Order order);
	public void deleteOrder(int i);
	public ArrayList<Order> getAllOrders();
	public void removeByCustomer(String ID);
	
}
