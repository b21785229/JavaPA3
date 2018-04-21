import java.util.ArrayList;

public interface OrderDAO {

	public void addOrder(Order order);
	public void deleteOrder(int i);
	public ArrayList<Order> getAllOrders();
	
}
